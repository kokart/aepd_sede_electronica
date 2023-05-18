#include <AutoItConstants.au3>
Sleep(2000)
MouseClick($MOUSE_CLICK_LEFT, 1092, 632, 1)
Sleep(2000)
MouseClick($MOUSE_CLICK_LEFT, 977, 402, 1)
Sleep(2000)
MouseClick($MOUSE_CLICK_LEFT, 1062, 229, 1)
Sleep(2000)
MouseClick($MOUSE_CLICK_LEFT, 1062, 229, 1)
Sleep(8000)

#Click Aceptar
runWait(@comSpec & ' /c cscript.exe "C:\scripts_firma\AceptarFirmaCiudadano.vbs"', '', @SW_HIDE)

