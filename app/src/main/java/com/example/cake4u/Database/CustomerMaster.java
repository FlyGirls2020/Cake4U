package com.example.cake4u.Database;

import android.graphics.Bitmap;
import android.provider.BaseColumns;


public final class CustomerMaster {
    public static CakeCategory SellerCaketItems;

    private CustomerMaster(){}

    public static class Customers implements BaseColumns {
        public static final String TABLE_NAME="customer";
        public static final String  COLUMN_NAME_ID="id";
        public static final String COLUMN_NAME_NAME="name";
        public static final String COLUMN_NAME_PASSWORD="password";
        public static final String COLUMN_NAME_EMAIL="email_id";
    }

    public static class Profile implements BaseColumns{
            public static final String TABLE_NAME="profile";
            public static final String COLUMN_NAME_ID="id";
            public static final String COLUMN_NAME_IMAGE="photo";
            public static final String  COLUMN_FOREIGNKEY_CUS_ID="cus_id";
    }

    public static class CakeCategory implements  BaseColumns{
        public static final String TABLE_NAME="Cake_category";
        public static final String COLUMN_NAME_ID="id";
        public static final String COLUMN_NAME_IMAGE="image";
        public static final String  COLIMN_NAME_CATEGORY_NAME="category";
    }
    public static class CakeItems implements BaseColumns{
        public static final String TABLE_NAME="Cakes";
        public static final String COLUMN_NAME_ID="id";
        public static final String COLUMN_NAME_PRODUCT_NAME="name";
        public static final String COLUMN_NAME_COUNT="count";
        public static final String  COLUMN_NAME_PRICE="price";
        public static final String COLUMN_NAME_DESCRIPTION="description";
        public static final String COLUMN_NAME_PRODUCTIMAGE="image";
        public static final String COLUMN_NAME_FOREIGNKEY="cid";
        public static final String COLUMN_NAME_CATEGORY_NAME="cname";

        public CakeItems(Bitmap bitmap) {
        }

        public void setId(String id) {
        }
    }
    public static class PaymentDetails implements BaseColumns{
        public static final String TABLE_NAME="payment";
        public static final String COLUMN_NAME_ID="p_id";
        public static final String COLUMN_NAME="name";
        public static final String COLUMN_NAME_MAIL="mail";
        public static final String COLUMN_NAME_ZIP="Zip";
        public static final String COLUMN_NAME_CARD="card";
        public static final String COLUMN_NAME_CITY="city";
        public static final String COLUMN_NAME_CUS_ID="cus_id";
        public static final String COLUMN_NAME_AMOUNT="amount";
        public static final String COLUMN_NAME_ORDER="or_id";
    }

    public static class Cus_Order implements  BaseColumns{
        public static  final String TABLE_NAME="orders";
        public static final String  COLUMN_NAME_ID="id";
        public static final String COLUMN_NAME_CUS_ID="cuid";
        public static final String COLUMN_NAME_AMOUNT="amount";
        public static final String COLUMN_NAME_DELIVERY="delevery";
    }

    public static class UserCart implements BaseColumns{
        public static final String TABLE_NAME="cart";
        public static final String COLUMN_ID="id";
        public static final String COLUMN_NAME="name";
        public static final String COLUMN_DES="des";
        public static final String COLUMN_PRICE="price";
        public static final String COLUMN_COUNT="count";
        public static final String COLUMN_TOTAL="total";
        public static final String COLUMN_IMAGE="image";
        public static final String COLUMN_FOREIGN="cid";
        public static final String COLUMN_FOREIGN1="pid";
        public static final String COLUMN_DEFAULT_CHECK="order_check";
    }

    public static class User_cart_notification implements  BaseColumns{
        public static final String TABLE_NAME="cart_count";
        public static final String COLUMN_ID="id";
        public static final String COLUMN_COUNT="count";
        public static final String COLUMN_CUS_ID="cus_id";
    }

    public static class User_order_notification implements  BaseColumns{
        public static final String TABLE_NAME="orders_count";
        public static final String COLUMN_ID="id";
        public static final String COLUMN_COUNT="count";
        public static final String COLUMN_CUS_ID="cus_id";
    }


    public static class SellerCakeItems implements BaseColumns{
        public static final String TABLE_NAME="seller_cakes";
        public static final String COLUMN_NAME_ID="id";
        public static final String COLUMN_NAME_PRODUCT_NAME="name";
        public static final String COLUMN_NAME_COUNT="count";
        public static final String  COLUMN_NAME_PRICE="price";
        public static final String COLUMN_NAME_DESCRIPTION="description";
        public static final String COLUMN_NAME_PRODUCTIMAGE="image";
    }

    public static class Seller implements BaseColumns{
        public static final String COLUMN_NAME_ID="id";
        public static final String TABLE_NAME="seller";
        public static final String COLUMN_NAME_USER_NAME="user_name";
        public static final String COLUMN_NAME_EMAIL="mail";
        public static final String COLUMN_NAME_PASSWORD="password";
        public static final String COLUMN_NAME_CUSTOMER="cus_id";
        public static final String COLUMN_NAME_CHECK_CUSTOMER="chk";
    }
}
