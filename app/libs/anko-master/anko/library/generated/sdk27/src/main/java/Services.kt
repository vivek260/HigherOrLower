@file:JvmName("Sdk27ServicesKt")
package org.jetbrains.anko


import android.content.Context
import android.view.accessibility.AccessibilityManager
import android.accounts.AccountManager
import android.app.ActivityManager
import android.app.AlarmManager
import android.app.AppOpsManager
import android.media.AudioManager
import android.os.BatteryManager
import android.bluetooth.BluetoothManager
import android.hardware.camera2.CameraManager
import android.view.accessibility.CaptioningManager
import android.telephony.CarrierConfigManager
import android.content.ClipboardManager
import android.companion.CompanionDeviceManager
import android.net.ConnectivityManager
import android.hardware.ConsumerIrManager
import android.app.admin.DevicePolicyManager
import android.hardware.display.DisplayManager
import android.app.DownloadManager
import android.hardware.fingerprint.FingerprintManager
import android.os.HardwarePropertiesManager
import android.hardware.input.InputManager
import android.view.inputmethod.InputMethodManager
import android.app.KeyguardManager
import android.location.LocationManager
import android.media.projection.MediaProjectionManager
import android.media.session.MediaSessionManager
import android.media.midi.MidiManager
import android.app.usage.NetworkStatsManager
import android.nfc.NfcManager
import android.app.NotificationManager
import android.net.nsd.NsdManager
import android.os.PowerManager
import android.print.PrintManager
import android.content.RestrictionsManager
import android.app.SearchManager
import android.hardware.SensorManager
import android.content.pm.ShortcutManager
import android.os.storage.StorageManager
import android.app.usage.StorageStatsManager
import android.os.health.SystemHealthManager
import android.telecom.TelecomManager
import android.telephony.TelephonyManager
import android.view.textclassifier.TextClassificationManager
import android.media.tv.TvInputManager
import android.app.UiModeManager
import android.app.usage.UsageStatsManager
import android.hardware.usb.UsbManager
import android.os.UserManager
import android.app.WallpaperManager
import android.net.wifi.aware.WifiAwareManager
import android.net.wifi.WifiManager
import android.net.wifi.p2p.WifiP2pManager
import android.view.WindowManager


/** Returns the AccessibilityManager instance. **/
val Context.accessibilityManager: AccessibilityManager
    get() = getSystemService(Context.ACCESSIBILITY_SERVICE) as AccessibilityManager


/** Returns the AccountManager instance. **/
val Context.accountManager: AccountManager
    get() = getSystemService(Context.ACCOUNT_SERVICE) as AccountManager


/** Returns the ActivityManager instance. **/
val Context.activityManager: ActivityManager
    get() = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager


/** Returns the AlarmManager instance. **/
val Context.alarmManager: AlarmManager
    get() = getSystemService(Context.ALARM_SERVICE) as AlarmManager


/** Returns the AppOpsManager instance. **/
val Context.appOpsManager: AppOpsManager
    get() = getSystemService(Context.APP_OPS_SERVICE) as AppOpsManager


/** Returns the AudioManager instance. **/
val Context.audioManager: AudioManager
    get() = getSystemService(Context.AUDIO_SERVICE) as AudioManager


/** Returns the BatteryManager instance. **/
val Context.batteryManager: BatteryManager
    get() = getSystemService(Context.BATTERY_SERVICE) as BatteryManager


/** Returns the BluetoothManager instance. **/
val Context.bluetoothManager: BluetoothManager
    get() = getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager


/** Returns the CameraManager instance. **/
val Context.cameraManager: CameraManager
    get() = getSystemService(Context.CAMERA_SERVICE) as CameraManager


/** Returns the CaptioningManager instance. **/
val Context.captioningManager: CaptioningManager
    get() = getSystemService(Context.CAPTIONING_SERVICE) as CaptioningManager


/** Returns the CarrierConfigManager instance. **/
val Context.carrierConfigManager: CarrierConfigManager
    get() = getSystemService(Context.CARRIER_CONFIG_SERVICE) as CarrierConfigManager


/** Returns the ClipboardManager instance. **/
val Context.clipboardManager: ClipboardManager
    get() = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager


/** Returns the CompanionDeviceManager instance. **/
val Context.companionDeviceManager: CompanionDeviceManager
    get() = getSystemService(Context.COMPANION_DEVICE_SERVICE) as CompanionDeviceManager


/** Returns the ConnectivityManager instance. **/
val Context.connectivityManager: ConnectivityManager
    get() = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager


/** Returns the ConsumerIrManager instance. **/
val Context.consumerIrManager: ConsumerIrManager
    get() = getSystemService(Context.CONSUMER_IR_SERVICE) as ConsumerIrManager


/** Returns the DevicePolicyManager instance. **/
val Context.devicePolicyManager: DevicePolicyManager
    get() = getSystemService(Context.DEVICE_POLICY_SERVICE) as DevicePolicyManager


/** Returns the DisplayManager instance. **/
val Context.displayManager: DisplayManager
    get() = getSystemService(Context.DISPLAY_SERVICE) as DisplayManager


/** Returns the DownloadManager instance. **/
val Context.downloadManager: DownloadManager
    get() = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager


/** Returns the FingerprintManager instance. **/
val Context.fingerprintManager: FingerprintManager
    get() = getSystemService(Context.FINGERPRINT_SERVICE) as FingerprintManager


/** Returns the HardwarePropertiesManager instance. **/
val Context.hardwarePropertiesManager: HardwarePropertiesManager
    get() = getSystemService(Context.HARDWARE_PROPERTIES_SERVICE) as HardwarePropertiesManager


/** Returns the InputManager instance. **/
val Context.inputManager: InputManager
    get() = getSystemService(Context.INPUT_SERVICE) as InputManager


/** Returns the InputMethodManager instance. **/
val Context.inputMethodManager: InputMethodManager
    get() = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager


/** Returns the KeyguardManager instance. **/
val Context.keyguardManager: KeyguardManager
    get() = getSystemService(Context.KEYGUARD_SERVICE) as KeyguardManager


/** Returns the LocationManager instance. **/
val Context.locationManager: LocationManager
    get() = getSystemService(Context.LOCATION_SERVICE) as LocationManager


/** Returns the MediaProjectionManager instance. **/
val Context.mediaProjectionManager: MediaProjectionManager
    get() = getSystemService(Context.MEDIA_PROJECTION_SERVICE) as MediaProjectionManager


/** Returns the MediaSessionManager instance. **/
val Context.mediaSessionManager: MediaSessionManager
    get() = getSystemService(Context.MEDIA_SESSION_SERVICE) as MediaSessionManager


/** Returns the MidiManager instance. **/
val Context.midiManager: MidiManager
    get() = getSystemService(Context.MIDI_SERVICE) as MidiManager


/** Returns the NetworkStatsManager instance. **/
val Context.networkStatsManager: NetworkStatsManager
    get() = getSystemService(Context.NETWORK_STATS_SERVICE) as NetworkStatsManager


/** Returns the NfcManager instance. **/
val Context.nfcManager: NfcManager
    get() = getSystemService(Context.NFC_SERVICE) as NfcManager


/** Returns the NotificationManager instance. **/
val Context.notificationManager: NotificationManager
    get() = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager


/** Returns the NsdManager instance. **/
val Context.nsdManager: NsdManager
    get() = getSystemService(Context.NSD_SERVICE) as NsdManager


/** Returns the PowerManager instance. **/
val Context.powerManager: PowerManager
    get() = getSystemService(Context.POWER_SERVICE) as PowerManager


/** Returns the PrintManager instance. **/
val Context.printManager: PrintManager
    get() = getSystemService(Context.PRINT_SERVICE) as PrintManager


/** Returns the RestrictionsManager instance. **/
val Context.restrictionsManager: RestrictionsManager
    get() = getSystemService(Context.RESTRICTIONS_SERVICE) as RestrictionsManager


/** Returns the SearchManager instance. **/
val Context.searchManager: SearchManager
    get() = getSystemService(Context.SEARCH_SERVICE) as SearchManager


/** Returns the SensorManager instance. **/
val Context.sensorManager: SensorManager
    get() = getSystemService(Context.SENSOR_SERVICE) as SensorManager


/** Returns the ShortcutManager instance. **/
val Context.shortcutManager: ShortcutManager
    get() = getSystemService(Context.SHORTCUT_SERVICE) as ShortcutManager


/** Returns the StorageManager instance. **/
val Context.storageManager: StorageManager
    get() = getSystemService(Context.STORAGE_SERVICE) as StorageManager


/** Returns the StorageStatsManager instance. **/
val Context.storageStatsManager: StorageStatsManager
    get() = getSystemService(Context.STORAGE_STATS_SERVICE) as StorageStatsManager


/** Returns the SystemHealthManager instance. **/
val Context.systemHealthManager: SystemHealthManager
    get() = getSystemService(Context.SYSTEM_HEALTH_SERVICE) as SystemHealthManager


/** Returns the TelecomManager instance. **/
val Context.telecomManager: TelecomManager
    get() = getSystemService(Context.TELECOM_SERVICE) as TelecomManager


/** Returns the TelephonyManager instance. **/
val Context.telephonyManager: TelephonyManager
    get() = getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager


/** Returns the TextClassificationManager instance. **/
val Context.textClassificationManager: TextClassificationManager
    get() = getSystemService(Context.TEXT_CLASSIFICATION_SERVICE) as TextClassificationManager


/** Returns the TvInputManager instance. **/
val Context.tvInputManager: TvInputManager
    get() = getSystemService(Context.TV_INPUT_SERVICE) as TvInputManager


/** Returns the UiModeManager instance. **/
val Context.uiModeManager: UiModeManager
    get() = getSystemService(Context.UI_MODE_SERVICE) as UiModeManager


/** Returns the UsageStatsManager instance. **/
val Context.usageStatsManager: UsageStatsManager
    get() = getSystemService(Context.USAGE_STATS_SERVICE) as UsageStatsManager


/** Returns the UsbManager instance. **/
val Context.usbManager: UsbManager
    get() = getSystemService(Context.USB_SERVICE) as UsbManager


/** Returns the UserManager instance. **/
val Context.userManager: UserManager
    get() = getSystemService(Context.USER_SERVICE) as UserManager


/** Returns the WallpaperManager instance. **/
val Context.wallpaperManager: WallpaperManager
    get() = getSystemService(Context.WALLPAPER_SERVICE) as WallpaperManager


/** Returns the WifiAwareManager instance. **/
val Context.wifiAwareManager: WifiAwareManager
    get() = getSystemService(Context.WIFI_AWARE_SERVICE) as WifiAwareManager


/** Returns the WifiManager instance. **/
val Context.wifiManager: WifiManager
    get() = getSystemService(Context.WIFI_SERVICE) as WifiManager


/** Returns the WifiP2pManager instance. **/
val Context.wifiP2pManager: WifiP2pManager
    get() = getSystemService(Context.WIFI_P2P_SERVICE) as WifiP2pManager


/** Returns the WindowManager instance. **/
val Context.windowManager: WindowManager
    get() = getSystemService(Context.WINDOW_SERVICE) as WindowManager

