Set oShell = CreateObject("WScript.Shell")
Set oShell2 = CreateObject("WScript.Shell")
Dim x
x=oShell.AppActivate("Firma con certificado local - Google Chrome")
Dim y
y=oShell2.AppActivate("Di�logo de seguridad del almac�n Windows")
Do While x=0
x=oShell.AppActivate("Firma con certificado local - Google Chrome")
Loop
If oShell.AppActivate("Firma con certificado local - Google Chrome") Then
	oShell.SendKeys "{LEFT}"
    oShell.SendKeys "{ENTER}"
End If 
Do While y=0
y=oShell.AppActivate("Di�logo de seguridad del almac�n Windows")
Loop
If oShell.AppActivate("Di�logo de seguridad del almac�n Windows") Then
    oShell2.SendKeys "{ENTER}"
End If 
WScript.Quit