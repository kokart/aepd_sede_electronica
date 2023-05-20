Set oShell = CreateObject("WScript.Shell")
WScript.Sleep(4000)
If oShell.AppActivate("Firma con certificado local - Google Chrome") Then
	oShell.SendKeys "{LEFT}"
    oShell.SendKeys "{ENTER}"
End If 
Set oShell = nothing

Set oShell2 = CreateObject("WScript.Shell")
WScript.Sleep(4000)
If oShell2.AppActivate("Diálogo de seguridad del almacén Windows") Then
	oShell2.SendKeys "{PGDN}"
    oShell2.SendKeys "{ENTER}"
End If 
Set oShell2 = nothing
WScript.Quit