Set oShell = CreateObject("WScript.Shell")
Set oShell2 = CreateObject("WScript.Shell")
Dim x
x=oShell.AppActivate("Firma con certificado local - Google Chrome")
Dim y
y=oShell2.AppActivate("Diálogo de seguridad del almacén Windows")
Do While x=0
x=oShell.AppActivate("Firma con certificado local - Google Chrome")
Loop
If oShell.AppActivate("Firma con certificado local - Google Chrome") Then
	oShell.SendKeys "{LEFT}"
    oShell.SendKeys "{ENTER}"
End If 
Do While y=0
y=oShell.AppActivate("Diálogo de seguridad del almacén Windows")
Loop
If oShell.AppActivate("Diálogo de seguridad del almacén Windows") Then
    oShell2.SendKeys "{ENTER}"
End If 
WScript.Quit