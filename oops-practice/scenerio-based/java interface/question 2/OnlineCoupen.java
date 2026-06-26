interface CouponValidator {
    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code.length() == 6;
    }
}

class ShoppingCart implements CouponValidator {

    public boolean validateCoupon(String code) {
        return CouponValidator.isLengthValid(code) && code.startsWith("SAVE");
    }
}

public class OnlineCoupen {
    public static void main(String[] args) {
        String[] coupons = {"SAVE10", "DISCOUNT", "SAVE20", "OFF5", "SAVE99"};

        ShoppingCart cart = new ShoppingCart();

        for (String coupon : coupons) {
            if (cart.validateCoupon(coupon)) {
                System.out.println(coupon + " is valid");
            } else {
                System.out.println(coupon + " is invalid");
            }
        }
    }
}