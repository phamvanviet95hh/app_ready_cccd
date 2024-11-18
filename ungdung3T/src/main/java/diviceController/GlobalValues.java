package diviceController;

import Api.BaseResponse;
import org.ihub.id.SICIImpl;
import org.ihub.id.model.CitizenInfoModel;

public class GlobalValues {
    public static String LOGIN_NAME;
    public static String EMAIL;
    public static String RAR_VERIFY_CODE;
    public static String FACE_MATCHING_CODE;
    public static Boolean CARD_VERIFICATION_STATUS = false;
    public static Boolean CHECK_AA = false;
    public static Boolean CHECK_Internet = false;
    public static byte[] anhDaiDien = null;
    public static Boolean checkRar = false;
    public static BaseResponse responseApi;
    public static Boolean CHECK_FACE = false;
    public static Boolean Check_CSV = false;
    public static String DS_CERT = null;
    public  static  String EXPORT_CSV = "C:\\EID\\Export";
    // trang thai ket noi thiet bi
    public static boolean CONNECT_DEVICE_STATUS = false;
    public static boolean CONNECT_CAMERA_STATUS = false;

    public static void setEmail(String input) {
        EMAIL = input;
    }

    public static void setLoginName(String input) {
        LOGIN_NAME = input;
    }


    public static void setRarVerifyCode(String input) {
        RAR_VERIFY_CODE = input;
    }

    public static void setFaceMatchingCode(String input) {
        FACE_MATCHING_CODE = input;
    }

    public static void setConnectDeviceStatus(boolean input) {
        CONNECT_DEVICE_STATUS = input;
    }

    public static void setConnectCameraStatus(boolean input) {
        CONNECT_CAMERA_STATUS = input;
    }

    public static void setCardVerificationStatus(boolean input) {
        CARD_VERIFICATION_STATUS = input;
    }
    public static void setCHECK_Internet(boolean input) {
        CHECK_Internet = input;
    }
    public static void setCheckAa(boolean input) {
        CHECK_AA = input;
    }
}
