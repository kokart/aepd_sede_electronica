Set oShell = CreateObject("WScript.Shell")
WScript.Sleep(3000)
If oShell.AppActivate("Firma con certificado local - Google Chrome") Then
	oShell.SendKeys "{LEFT}"
    oShell.SendKeys "{ENTER}"
End If 
Set oShell = nothing
WScript.Quit
