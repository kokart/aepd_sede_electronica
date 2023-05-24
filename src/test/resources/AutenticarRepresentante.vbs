Set oShell = CreateObject("WScript.Shell")
WScript.Sleep(4000)
Dim x
x=oShell.AppActivate("Cl@ve: Ministerio de Hacienda y Función Pública - Google Chrome")
Do While x=0
x=oShell.AppActivate("Cl@ve: Ministerio de Hacienda y Función Pública - Google Chrome")
Loop
If oShell.AppActivate("Cl@ve: Ministerio de Hacienda y Función Pública - Google Chrome") Then
    oShell.SendKeys "{ENTER}"
End If 
Set oShell = nothing
WScript.Quit