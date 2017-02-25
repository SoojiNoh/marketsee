LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := native_sample
LOCAL_LDFLAGS := -Wl,--build-id
LOCAL_SRC_FILES := \
	C:\OpenCV-Square-Tracking-Android-JNI-master1\app\src\main\jni\Android.mk \
	C:\OpenCV-Square-Tracking-Android-JNI-master1\app\src\main\jni\Application.mk \
	C:\OpenCV-Square-Tracking-Android-JNI-master1\app\src\main\jni\cvcamera_jni.cpp \
	C:\OpenCV-Square-Tracking-Android-JNI-master1\app\src\main\jni\jni_part.cpp \
	C:\OpenCV-Square-Tracking-Android-JNI-master1\app\src\main\jni\Processor.cpp \

LOCAL_C_INCLUDES += C:\OpenCV-Square-Tracking-Android-JNI-master1\app\src\main\jni
LOCAL_C_INCLUDES += C:\OpenCV-Square-Tracking-Android-JNI-master1\app\src\debug\jni

include $(BUILD_SHARED_LIBRARY)
