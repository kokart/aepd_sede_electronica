Set oShell = CreateObject("WScript.Shell")

If oShell.AppActivate("Diálogo de seguridad del almacén Windows") Then
	oShell.SendKeys "{PGDN}"
    oShell.SendKeys "{ENTER}"
End If 
Set oShell = nothing
WScript.Quit