Set oShell = CreateObject("WScript.Shell")

WScript.Sleep(3000)
If oShell.AppActivate("Cl@ve: Ministerio de Hacienda y Funci�n P�blica - Google Chrome") Then
	oShell.SendKeys "{PGDN}"
    oShell.SendKeys "{ENTER}"
End If 
Set oShell = nothing
WScript.Quit
