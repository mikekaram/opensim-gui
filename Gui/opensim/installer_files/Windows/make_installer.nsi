;NSIS Modern User Interface
;Build Windows Installer Script

;--------------------------------
;Include Modern UI

  !include "MUI2.nsh"

;--------------------------------
;General

  ;Name and file
  Name "OpenSim @VERSION@"
  OutFile "OpenSim-@VERSION@-win64.exe"

  ;Set compression
  SetCompressor lzma

  ;Default installation folder
  InstallDir "C:\OpenSim @VERSION@"
  
  ;Get installation folder from registry if available
  InstallDirRegKey HKCU "Software\OpenSim @VERSION@" ""

  ;Request application privileges for Windows Vista
  RequestExecutionLevel user

;--------------------------------
;Interface Settings

  !define MUI_HEADERIMAGE
  !define MUI_ABORTWARNING

;--------------------------------
; Installation types


;--------------------------------
; Component sections


;--------------------------------
; Define some macro setting for the gui

!define MUI_HEADERIMAGE_BITMAP "OpenSimInstallerIcon.bmp"



;--------------------------------
;Pages
  !insertmacro MUI_PAGE_WELCOME

  !insertmacro MUI_PAGE_LICENSE "opensim\LICENSE.txt"
  !insertmacro MUI_PAGE_COMPONENTS
  !insertmacro MUI_PAGE_DIRECTORY
  !insertmacro MUI_PAGE_INSTFILES

  !insertmacro MUI_PAGE_INSTFILES
  !insertmacro MUI_PAGE_FINISH

  !insertmacro MUI_UNPAGE_CONFIRM
  !insertmacro MUI_UNPAGE_INSTFILES
  
;--------------------------------
;Languages
 
  !insertmacro MUI_LANGUAGE "English"

;--------------------------------
;Installer Sections

Section "OpenSim Application" SecMain
  SetOutPath "$INSTDIR"
  File /r opensim\*.*
  
  ;Store installation folder
  WriteRegStr HKCU "Software\OpenSim@VERSION@" "" $INSTDIR
 
;Create shortcuts
  CreateShortCut "$DESKTOP\OpenSim @VERSION@.lnk" "$INSTDIR\bin\opensim64.exe" ""

  ;Create uninstaller
  WriteUninstaller "$INSTDIR\Uninstall.exe"

SectionEnd

;--------------------------------
;Descriptions

  ;Language strings
  LangString DESC_SecMain ${LANG_ENGLISH} "Install OpenSim Application."

  ;Assign language strings to sections
  !insertmacro MUI_FUNCTION_DESCRIPTION_BEGIN
    !insertmacro MUI_DESCRIPTION_TEXT ${SecMain} $(DESC_SecMain)
  !insertmacro MUI_FUNCTION_DESCRIPTION_END

;--------------------------------
;Uninstaller Section

Section "Uninstall"

  ;ADD YOUR OWN FILES HERE...

  Delete "$INSTDIR\Uninstall.exe"

  RMDir "$INSTDIR"

  DeleteRegKey /ifempty HKCU "Software\OpenSim@VERSION@"

SectionEnd
