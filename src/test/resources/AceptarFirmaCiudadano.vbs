Set oShell = CreateObject("WScript.Shell")

If oShell.AppActivate("Di�logo de seguridad del almac�n Windows") Then
	oShell.SendKeys "{PGDN}"
    oShell.SendKeys "{ENTER}"
End If 
Set oShell = nothing
WScript.Quit