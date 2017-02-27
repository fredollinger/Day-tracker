help:
	echo make install to install to phone

install:
	adb -d install /clamzfs/follinge/StudioProjects/Day-tracker/app/build/outputs/apk/app-debug.apk
