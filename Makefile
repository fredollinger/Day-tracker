APP=app-release-unsigned.apk
APP=app-debug.apk

help:
	echo make install to install to phone

uninstall:
	adb -d uninstall /clamzfs/follinge/StudioProjects/Day-tracker/app/build/outputs/apk/app-debug.apk

install:
#                         /clamzfs/follinge/StudioProjects/Day-tracker/app/build/outputs/apk/
#	adb -d uninstall /clamzfs/follinge/StudioProjects/Day-tracker/app/build/outputs/apk/app-debug.apk
	adb -d install -r /clamzfs/follinge/StudioProjects/Day-tracker/app/build/outputs/apk/app-debug.apk

emu:
	sudo cp /clamzfs/follinge/StudioProjects/Day-tracker/app/build/outputs/apk/app-debug.apk /srv/files/ftp

rm:
	rm -f /clamzfs/follinge/StudioProjects/Day-tracker/app/build/outputs/apk/app-debug.apk

cp:
	cp /clamzfs/follinge/StudioProjects/Day-tracker/app/build/outputs/apk/$(APP) ~/Android
