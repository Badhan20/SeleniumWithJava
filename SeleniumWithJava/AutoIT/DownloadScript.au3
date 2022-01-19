#include <InetConstants.au3>
#include <MsgBoxConstants.au3>
#include <WinAPIFiles.au3>

; Download a file in the background.
; Wait for the download to complete.

Example()

Func Example()
	; Save the downloaded file to the temporary folder.
	Local $sFilePath = "C:\Users\BADHAN\Downloads\selenium-server-4.1.1.jar"

	; Download the file in the background with the selected option of 'force a reload from the remote site.'
	Local $hDownload = InetGet("https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.1.0/selenium-server-4.1.1.jar", $sFilePath, $INET_FORCERELOAD)

EndFunc   ;==>Example
