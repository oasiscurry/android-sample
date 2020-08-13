// ==============================================================================
// プログラム名：アンプ風カウンター
// 作成者      ：shingo.yoshioka
// 作成日      ：2019年07月02日(火)
// 更新日      ：2019年07月02日(火)
// 概要        ：AndroidのカウンターアプリLED表示部のコントローラークラス
// ==============================================================================
package com.example.counter;

import android.widget.ImageView;

public class LedController {

    // コンストラクタ
    public LedController(MainActivity mainActivity) {
        // カウンター1(最も左のカウンター)を初期化
        ImageView set_cnt_1_1;
        ImageView set_cnt_1_2;
        ImageView set_cnt_1_3;
        ImageView set_cnt_1_4;
        set_cnt_1_1 = mainActivity.findViewById(R.id.led_cnt_1_1);
        set_cnt_1_1.setImageResource(R.drawable.num_0);
        set_cnt_1_2 = mainActivity.findViewById(R.id.led_cnt_1_2);
        set_cnt_1_2.setImageResource(R.drawable.num_none);
        set_cnt_1_3 = mainActivity.findViewById(R.id.led_cnt_1_3);
        set_cnt_1_3.setImageResource(R.drawable.num_none);
        set_cnt_1_4 = mainActivity.findViewById(R.id.led_cnt_1_4);
        set_cnt_1_4.setImageResource(R.drawable.num_none);

        // カウンター2を初期化
        ImageView set_cnt_2_1;
        ImageView set_cnt_2_2;
        ImageView set_cnt_2_3;
        ImageView set_cnt_2_4;
        set_cnt_2_1 = mainActivity.findViewById(R.id.led_cnt_2_1);
        set_cnt_2_1.setImageResource(R.drawable.num_0);
        set_cnt_2_2 = mainActivity.findViewById(R.id.led_cnt_2_2);
        set_cnt_2_2.setImageResource(R.drawable.num_none);
        set_cnt_2_3 = mainActivity.findViewById(R.id.led_cnt_2_3);
        set_cnt_2_3.setImageResource(R.drawable.num_none);
        set_cnt_2_4 = mainActivity.findViewById(R.id.led_cnt_2_4);
        set_cnt_2_4.setImageResource(R.drawable.num_none);

        // カウンター3を初期化
        ImageView set_cnt_3_1;
        ImageView set_cnt_3_2;
        ImageView set_cnt_3_3;
        ImageView set_cnt_3_4;
        set_cnt_3_1 = mainActivity.findViewById(R.id.led_cnt_3_1);
        set_cnt_3_1.setImageResource(R.drawable.num_0);
        set_cnt_3_2 = mainActivity.findViewById(R.id.led_cnt_3_2);
        set_cnt_3_2.setImageResource(R.drawable.num_none);
        set_cnt_3_3 = mainActivity.findViewById(R.id.led_cnt_3_3);
        set_cnt_3_3.setImageResource(R.drawable.num_none);
        set_cnt_3_4 = mainActivity.findViewById(R.id.led_cnt_3_4);
        set_cnt_3_4.setImageResource(R.drawable.num_none);

        // カウンター4を初期化
        ImageView set_cnt_4_1;
        ImageView set_cnt_4_2;
        ImageView set_cnt_4_3;
        ImageView set_cnt_4_4;
        set_cnt_4_1 = mainActivity.findViewById(R.id.led_cnt_4_1);
        set_cnt_4_1.setImageResource(R.drawable.num_0);
        set_cnt_4_2 = mainActivity.findViewById(R.id.led_cnt_4_2);
        set_cnt_4_2.setImageResource(R.drawable.num_none);
        set_cnt_4_3 = mainActivity.findViewById(R.id.led_cnt_4_3);
        set_cnt_4_3.setImageResource(R.drawable.num_none);
        set_cnt_4_4 = mainActivity.findViewById(R.id.led_cnt_4_4);
        set_cnt_4_4.setImageResource(R.drawable.num_none);

        // カウンター5を初期化
        ImageView set_cnt_5_1;
        ImageView set_cnt_5_2;
        ImageView set_cnt_5_3;
        ImageView set_cnt_5_4;
        set_cnt_5_1 = mainActivity.findViewById(R.id.led_cnt_5_1);
        set_cnt_5_1.setImageResource(R.drawable.num_0);
        set_cnt_5_2 = mainActivity.findViewById(R.id.led_cnt_5_2);
        set_cnt_5_2.setImageResource(R.drawable.num_none);
        set_cnt_5_3 = mainActivity.findViewById(R.id.led_cnt_5_3);
        set_cnt_5_3.setImageResource(R.drawable.num_none);
        set_cnt_5_4 = mainActivity.findViewById(R.id.led_cnt_5_4);
        set_cnt_5_4.setImageResource(R.drawable.num_none);

        // カウンター6を初期化
        ImageView set_cnt_6_1;
        ImageView set_cnt_6_2;
        ImageView set_cnt_6_3;
        ImageView set_cnt_6_4;
        set_cnt_6_1 = mainActivity.findViewById(R.id.led_cnt_6_1);
        set_cnt_6_1.setImageResource(R.drawable.num_0);
        set_cnt_6_2 = mainActivity.findViewById(R.id.led_cnt_6_2);
        set_cnt_6_2.setImageResource(R.drawable.num_none);
        set_cnt_6_3 = mainActivity.findViewById(R.id.led_cnt_6_3);
        set_cnt_6_3.setImageResource(R.drawable.num_none);
        set_cnt_6_4 = mainActivity.findViewById(R.id.led_cnt_6_4);
        set_cnt_6_4.setImageResource(R.drawable.num_none);

        // 割合表示1を初期化
        ImageView set_per_1_1;
        ImageView set_per_1_2;
        ImageView set_per_1_3;
        ImageView set_per_1_4;
        set_per_1_1 = mainActivity.findViewById(R.id.led_per_1_1);
        set_per_1_1.setImageResource(R.drawable.num_0);
        set_per_1_2 = mainActivity.findViewById(R.id.led_per_1_2);
        set_per_1_2.setImageResource(R.drawable.num_0);
        set_per_1_3 = mainActivity.findViewById(R.id.led_per_1_3);
        set_per_1_3.setImageResource(R.drawable.num_none);
        set_per_1_4 = mainActivity.findViewById(R.id.led_per_1_4);
        set_per_1_4.setImageResource(R.drawable.num_none);

        // 割合表示2を初期化
        ImageView set_per_2_1;
        ImageView set_per_2_2;
        ImageView set_per_2_3;
        ImageView set_per_2_4;
        set_per_2_1 = mainActivity.findViewById(R.id.led_per_2_1);
        set_per_2_1.setImageResource(R.drawable.num_0);
        set_per_2_2 = mainActivity.findViewById(R.id.led_per_2_2);
        set_per_2_2.setImageResource(R.drawable.num_0);
        set_per_2_3 = mainActivity.findViewById(R.id.led_per_2_3);
        set_per_2_3.setImageResource(R.drawable.num_none);
        set_per_2_4 = mainActivity.findViewById(R.id.led_per_2_4);
        set_per_2_4.setImageResource(R.drawable.num_none);

        // 割合表示3を初期化
        ImageView set_per_3_1;
        ImageView set_per_3_2;
        ImageView set_per_3_3;
        ImageView set_per_3_4;
        set_per_3_1 = mainActivity.findViewById(R.id.led_per_3_1);
        set_per_3_1.setImageResource(R.drawable.num_0);
        set_per_3_2 = mainActivity.findViewById(R.id.led_per_3_2);
        set_per_3_2.setImageResource(R.drawable.num_0);
        set_per_3_3 = mainActivity.findViewById(R.id.led_per_3_3);
        set_per_3_3.setImageResource(R.drawable.num_none);
        set_per_3_4 = mainActivity.findViewById(R.id.led_per_3_4);
        set_per_3_4.setImageResource(R.drawable.num_none);

        // 割合表示4を初期化
        ImageView set_per_4_1;
        ImageView set_per_4_2;
        ImageView set_per_4_3;
        ImageView set_per_4_4;
        set_per_4_1 = mainActivity.findViewById(R.id.led_per_4_1);
        set_per_4_1.setImageResource(R.drawable.num_0);
        set_per_4_2 = mainActivity.findViewById(R.id.led_per_4_2);
        set_per_4_2.setImageResource(R.drawable.num_0);
        set_per_4_3 = mainActivity.findViewById(R.id.led_per_4_3);
        set_per_4_3.setImageResource(R.drawable.num_none);
        set_per_4_4 = mainActivity.findViewById(R.id.led_per_4_4);
        set_per_4_4.setImageResource(R.drawable.num_none);

        // 割合表示5を初期化
        ImageView set_per_5_1;
        ImageView set_per_5_2;
        ImageView set_per_5_3;
        ImageView set_per_5_4;
        set_per_5_1 = mainActivity.findViewById(R.id.led_per_5_1);
        set_per_5_1.setImageResource(R.drawable.num_0);
        set_per_5_2 = mainActivity.findViewById(R.id.led_per_5_2);
        set_per_5_2.setImageResource(R.drawable.num_0);
        set_per_5_3 = mainActivity.findViewById(R.id.led_per_5_3);
        set_per_5_3.setImageResource(R.drawable.num_none);
        set_per_5_4 = mainActivity.findViewById(R.id.led_per_5_4);
        set_per_5_4.setImageResource(R.drawable.num_none);
    }

    // ======================================
    // 関数名：SetLedCnt1
    // 引数  ：MainActivity
    //         LEDに表示する数字
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：カウンター1に数字を表示する
    // ======================================
    public void SetLedCnt1(MainActivity mainActivity, int num) {
        ImageView set_cnt_1_1;
        ImageView set_cnt_1_2;
        ImageView set_cnt_1_3;
        ImageView set_cnt_1_4;
        set_cnt_1_1 = mainActivity.findViewById(R.id.led_cnt_1_1);
        set_cnt_1_2 = mainActivity.findViewById(R.id.led_cnt_1_2);
        set_cnt_1_3 = mainActivity.findViewById(R.id.led_cnt_1_3);
        set_cnt_1_4 = mainActivity.findViewById(R.id.led_cnt_1_4);

        int num1 = num % 10;                // 1の位を格納
        int num10 = (num / 10) % 10;        // 10の位を格納
        int num100 = (num / 100) % 10;      // 100の位を格納
        int num1000 = (num / 1000) % 10;    // 1000の位を格納

        // 1の位をカウンターにセット
        switch(num1){
            case    0:
                set_cnt_1_1.setImageResource(R.drawable.num_0);
                break;
            case    1:
                set_cnt_1_1.setImageResource(R.drawable.num_1);
                break;
            case    2:
                set_cnt_1_1.setImageResource(R.drawable.num_2);
                break;
            case    3:
                set_cnt_1_1.setImageResource(R.drawable.num_3);
                break;
            case    4:
                set_cnt_1_1.setImageResource(R.drawable.num_4);
                break;
            case    5:
                set_cnt_1_1.setImageResource(R.drawable.num_5);
                break;
            case    6:
                set_cnt_1_1.setImageResource(R.drawable.num_6);
                break;
            case    7:
                set_cnt_1_1.setImageResource(R.drawable.num_7);
                break;
            case    8:
                set_cnt_1_1.setImageResource(R.drawable.num_8);
                break;
            case    9:
                set_cnt_1_1.setImageResource(R.drawable.num_9);
                break;
            default:
                set_cnt_1_1.setImageResource(R.drawable.num_0);
        }

        // 10の位をカウンターにセット
        switch(num10){
            case    0:
                if( num100 > 0 || num1000 > 0 ){
                    set_cnt_1_2.setImageResource(R.drawable.num_0);
                } else {
                    set_cnt_1_2.setImageResource(R.drawable.num_none);
                }
                break;
            case    1:
                set_cnt_1_2.setImageResource(R.drawable.num_1);
                break;
            case    2:
                set_cnt_1_2.setImageResource(R.drawable.num_2);
                break;
            case    3:
                set_cnt_1_2.setImageResource(R.drawable.num_3);
                break;
            case    4:
                set_cnt_1_2.setImageResource(R.drawable.num_4);
                break;
            case    5:
                set_cnt_1_2.setImageResource(R.drawable.num_5);
                break;
            case    6:
                set_cnt_1_2.setImageResource(R.drawable.num_6);
                break;
            case    7:
                set_cnt_1_2.setImageResource(R.drawable.num_7);
                break;
            case    8:
                set_cnt_1_2.setImageResource(R.drawable.num_8);
                break;
            case    9:
                set_cnt_1_2.setImageResource(R.drawable.num_9);
                break;
            default:
                set_cnt_1_2.setImageResource(R.drawable.num_0);
        }

        // 100の位をカウンターにセット
        switch(num100){
            case    0:
                if( num1000 > 0 ) {
                    set_cnt_1_3.setImageResource(R.drawable.num_0);
                } else {
                    set_cnt_1_3.setImageResource(R.drawable.num_none);
                }
                break;
            case    1:
                set_cnt_1_3.setImageResource(R.drawable.num_1);
                break;
            case    2:
                set_cnt_1_3.setImageResource(R.drawable.num_2);
                break;
            case    3:
                set_cnt_1_3.setImageResource(R.drawable.num_3);
                break;
            case    4:
                set_cnt_1_3.setImageResource(R.drawable.num_4);
                break;
            case    5:
                set_cnt_1_3.setImageResource(R.drawable.num_5);
                break;
            case    6:
                set_cnt_1_3.setImageResource(R.drawable.num_6);
                break;
            case    7:
                set_cnt_1_3.setImageResource(R.drawable.num_7);
                break;
            case    8:
                set_cnt_1_3.setImageResource(R.drawable.num_8);
                break;
            case    9:
                set_cnt_1_3.setImageResource(R.drawable.num_9);
                break;
            default:
                if( num1000 > 0 ) {
                    set_cnt_1_3.setImageResource(R.drawable.num_0);
                } else {
                    set_cnt_1_3.setImageResource(R.drawable.num_none);
                }
        }

        // 1000の位をカウンターにセット
        switch(num1000){
            case    0:
                set_cnt_1_4.setImageResource(R.drawable.num_none);
                break;
            case    1:
                set_cnt_1_4.setImageResource(R.drawable.num_1);
                break;
            case    2:
                set_cnt_1_4.setImageResource(R.drawable.num_2);
                break;
            case    3:
                set_cnt_1_4.setImageResource(R.drawable.num_3);
                break;
            case    4:
                set_cnt_1_4.setImageResource(R.drawable.num_4);
                break;
            case    5:
                set_cnt_1_4.setImageResource(R.drawable.num_5);
                break;
            case    6:
                set_cnt_1_4.setImageResource(R.drawable.num_6);
                break;
            case    7:
                set_cnt_1_4.setImageResource(R.drawable.num_7);
                break;
            case    8:
                set_cnt_1_4.setImageResource(R.drawable.num_8);
                break;
            case    9:
                set_cnt_1_4.setImageResource(R.drawable.num_9);
                break;
            default:
                set_cnt_1_4.setImageResource(R.drawable.num_none);
        }
    }

    // ======================================
    // 関数名：SetLedCnt2
    // 引数  ：MainActivity
    //         LEDに表示する数字
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：カウンター2に数字を表示する
    // ======================================
    public void SetLedCnt2(MainActivity mainActivity, int num) {
        ImageView set_cnt_2_1;
        ImageView set_cnt_2_2;
        ImageView set_cnt_2_3;
        ImageView set_cnt_2_4;
        set_cnt_2_1 = mainActivity.findViewById(R.id.led_cnt_2_1);
        set_cnt_2_2 = mainActivity.findViewById(R.id.led_cnt_2_2);
        set_cnt_2_3 = mainActivity.findViewById(R.id.led_cnt_2_3);
        set_cnt_2_4 = mainActivity.findViewById(R.id.led_cnt_2_4);

        int num1 = num % 10;                // 1の位を格納
        int num10 = (num / 10) % 10;        // 10の位を格納
        int num100 = (num / 100) % 10;      // 100の位を格納
        int num1000 = (num / 1000) % 10;    // 1000の位を格納

        // 1の位をカウンターにセット
        switch(num1){
            case    0:
                set_cnt_2_1.setImageResource(R.drawable.num_0);
                break;
            case    1:
                set_cnt_2_1.setImageResource(R.drawable.num_1);
                break;
            case    2:
                set_cnt_2_1.setImageResource(R.drawable.num_2);
                break;
            case    3:
                set_cnt_2_1.setImageResource(R.drawable.num_3);
                break;
            case    4:
                set_cnt_2_1.setImageResource(R.drawable.num_4);
                break;
            case    5:
                set_cnt_2_1.setImageResource(R.drawable.num_5);
                break;
            case    6:
                set_cnt_2_1.setImageResource(R.drawable.num_6);
                break;
            case    7:
                set_cnt_2_1.setImageResource(R.drawable.num_7);
                break;
            case    8:
                set_cnt_2_1.setImageResource(R.drawable.num_8);
                break;
            case    9:
                set_cnt_2_1.setImageResource(R.drawable.num_9);
                break;
            default:
                set_cnt_2_1.setImageResource(R.drawable.num_0);
        }

        // 10の位をカウンターにセット
        switch(num10){
            case    0:
                if( num100 > 0 || num1000 > 0 ){
                    set_cnt_2_2.setImageResource(R.drawable.num_0);
                } else {
                    set_cnt_2_2.setImageResource(R.drawable.num_none);
                }
                break;
            case    1:
                set_cnt_2_2.setImageResource(R.drawable.num_1);
                break;
            case    2:
                set_cnt_2_2.setImageResource(R.drawable.num_2);
                break;
            case    3:
                set_cnt_2_2.setImageResource(R.drawable.num_3);
                break;
            case    4:
                set_cnt_2_2.setImageResource(R.drawable.num_4);
                break;
            case    5:
                set_cnt_2_2.setImageResource(R.drawable.num_5);
                break;
            case    6:
                set_cnt_2_2.setImageResource(R.drawable.num_6);
                break;
            case    7:
                set_cnt_2_2.setImageResource(R.drawable.num_7);
                break;
            case    8:
                set_cnt_2_2.setImageResource(R.drawable.num_8);
                break;
            case    9:
                set_cnt_2_2.setImageResource(R.drawable.num_9);
                break;
            default:
                set_cnt_2_2.setImageResource(R.drawable.num_0);
        }

        // 100の位をカウンターにセット
        switch(num100){
            case    0:
                if( num1000 > 0 ) {
                    set_cnt_2_3.setImageResource(R.drawable.num_0);
                } else {
                    set_cnt_2_3.setImageResource(R.drawable.num_none);
                }
                break;
            case    1:
                set_cnt_2_3.setImageResource(R.drawable.num_1);
                break;
            case    2:
                set_cnt_2_3.setImageResource(R.drawable.num_2);
                break;
            case    3:
                set_cnt_2_3.setImageResource(R.drawable.num_3);
                break;
            case    4:
                set_cnt_2_3.setImageResource(R.drawable.num_4);
                break;
            case    5:
                set_cnt_2_3.setImageResource(R.drawable.num_5);
                break;
            case    6:
                set_cnt_2_3.setImageResource(R.drawable.num_6);
                break;
            case    7:
                set_cnt_2_3.setImageResource(R.drawable.num_7);
                break;
            case    8:
                set_cnt_2_3.setImageResource(R.drawable.num_8);
                break;
            case    9:
                set_cnt_2_3.setImageResource(R.drawable.num_9);
                break;
            default:
                if( num1000 > 0 ) {
                    set_cnt_2_3.setImageResource(R.drawable.num_0);
                } else {
                    set_cnt_2_3.setImageResource(R.drawable.num_none);
                }
        }

        // 1000の位をカウンターにセット
        switch(num1000){
            case    0:
                set_cnt_2_4.setImageResource(R.drawable.num_none);
                break;
            case    1:
                set_cnt_2_4.setImageResource(R.drawable.num_1);
                break;
            case    2:
                set_cnt_2_4.setImageResource(R.drawable.num_2);
                break;
            case    3:
                set_cnt_2_4.setImageResource(R.drawable.num_3);
                break;
            case    4:
                set_cnt_2_4.setImageResource(R.drawable.num_4);
                break;
            case    5:
                set_cnt_2_4.setImageResource(R.drawable.num_5);
                break;
            case    6:
                set_cnt_2_4.setImageResource(R.drawable.num_6);
                break;
            case    7:
                set_cnt_2_4.setImageResource(R.drawable.num_7);
                break;
            case    8:
                set_cnt_2_4.setImageResource(R.drawable.num_8);
                break;
            case    9:
                set_cnt_2_4.setImageResource(R.drawable.num_9);
                break;
            default:
                set_cnt_2_4.setImageResource(R.drawable.num_none);
        }
    }

    // ======================================
    // 関数名：SetLedCnt3
    // 引数  ：MainActivity
    //         LEDに表示する数字
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：カウンター3に数字を表示する
    // ======================================
    public void SetLedCnt3(MainActivity mainActivity, int num) {
        ImageView set_cnt_3_1;
        ImageView set_cnt_3_2;
        ImageView set_cnt_3_3;
        ImageView set_cnt_3_4;
        set_cnt_3_1 = mainActivity.findViewById(R.id.led_cnt_3_1);
        set_cnt_3_2 = mainActivity.findViewById(R.id.led_cnt_3_2);
        set_cnt_3_3 = mainActivity.findViewById(R.id.led_cnt_3_3);
        set_cnt_3_4 = mainActivity.findViewById(R.id.led_cnt_3_4);

        int num1 = num % 10;                // 1の位を格納
        int num10 = (num / 10) % 10;        // 10の位を格納
        int num100 = (num / 100) % 10;      // 100の位を格納
        int num1000 = (num / 1000) % 10;    // 1000の位を格納

        // 1の位をカウンターにセット
        switch(num1){
            case    0:
                set_cnt_3_1.setImageResource(R.drawable.num_0);
                break;
            case    1:
                set_cnt_3_1.setImageResource(R.drawable.num_1);
                break;
            case    2:
                set_cnt_3_1.setImageResource(R.drawable.num_2);
                break;
            case    3:
                set_cnt_3_1.setImageResource(R.drawable.num_3);
                break;
            case    4:
                set_cnt_3_1.setImageResource(R.drawable.num_4);
                break;
            case    5:
                set_cnt_3_1.setImageResource(R.drawable.num_5);
                break;
            case    6:
                set_cnt_3_1.setImageResource(R.drawable.num_6);
                break;
            case    7:
                set_cnt_3_1.setImageResource(R.drawable.num_7);
                break;
            case    8:
                set_cnt_3_1.setImageResource(R.drawable.num_8);
                break;
            case    9:
                set_cnt_3_1.setImageResource(R.drawable.num_9);
                break;
            default:
                set_cnt_3_1.setImageResource(R.drawable.num_0);
        }

        // 10の位をカウンターにセット
        switch(num10){
            case    0:
                if( num100 > 0 || num1000 > 0 ){
                    set_cnt_3_2.setImageResource(R.drawable.num_0);
                } else {
                    set_cnt_3_2.setImageResource(R.drawable.num_none);
                }
                break;
            case    1:
                set_cnt_3_2.setImageResource(R.drawable.num_1);
                break;
            case    2:
                set_cnt_3_2.setImageResource(R.drawable.num_2);
                break;
            case    3:
                set_cnt_3_2.setImageResource(R.drawable.num_3);
                break;
            case    4:
                set_cnt_3_2.setImageResource(R.drawable.num_4);
                break;
            case    5:
                set_cnt_3_2.setImageResource(R.drawable.num_5);
                break;
            case    6:
                set_cnt_3_2.setImageResource(R.drawable.num_6);
                break;
            case    7:
                set_cnt_3_2.setImageResource(R.drawable.num_7);
                break;
            case    8:
                set_cnt_3_2.setImageResource(R.drawable.num_8);
                break;
            case    9:
                set_cnt_3_2.setImageResource(R.drawable.num_9);
                break;
            default:
                set_cnt_3_2.setImageResource(R.drawable.num_0);
        }

        // 100の位をカウンターにセット
        switch(num100){
            case    0:
                if( num1000 > 0 ) {
                    set_cnt_3_3.setImageResource(R.drawable.num_0);
                } else {
                    set_cnt_3_3.setImageResource(R.drawable.num_none);
                }
                break;
            case    1:
                set_cnt_3_3.setImageResource(R.drawable.num_1);
                break;
            case    2:
                set_cnt_3_3.setImageResource(R.drawable.num_2);
                break;
            case    3:
                set_cnt_3_3.setImageResource(R.drawable.num_3);
                break;
            case    4:
                set_cnt_3_3.setImageResource(R.drawable.num_4);
                break;
            case    5:
                set_cnt_3_3.setImageResource(R.drawable.num_5);
                break;
            case    6:
                set_cnt_3_3.setImageResource(R.drawable.num_6);
                break;
            case    7:
                set_cnt_3_3.setImageResource(R.drawable.num_7);
                break;
            case    8:
                set_cnt_3_3.setImageResource(R.drawable.num_8);
                break;
            case    9:
                set_cnt_3_3.setImageResource(R.drawable.num_9);
                break;
            default:
                if( num1000 > 0 ) {
                    set_cnt_3_3.setImageResource(R.drawable.num_0);
                } else {
                    set_cnt_3_3.setImageResource(R.drawable.num_none);
                }
        }

        // 1000の位をカウンターにセット
        switch(num1000){
            case    0:
                set_cnt_3_4.setImageResource(R.drawable.num_none);
                break;
            case    1:
                set_cnt_3_4.setImageResource(R.drawable.num_1);
                break;
            case    2:
                set_cnt_3_4.setImageResource(R.drawable.num_2);
                break;
            case    3:
                set_cnt_3_4.setImageResource(R.drawable.num_3);
                break;
            case    4:
                set_cnt_3_4.setImageResource(R.drawable.num_4);
                break;
            case    5:
                set_cnt_3_4.setImageResource(R.drawable.num_5);
                break;
            case    6:
                set_cnt_3_4.setImageResource(R.drawable.num_6);
                break;
            case    7:
                set_cnt_3_4.setImageResource(R.drawable.num_7);
                break;
            case    8:
                set_cnt_3_4.setImageResource(R.drawable.num_8);
                break;
            case    9:
                set_cnt_3_4.setImageResource(R.drawable.num_9);
                break;
            default:
                set_cnt_3_4.setImageResource(R.drawable.num_none);
        }
    }

    // ======================================
    // 関数名：SetLedCnt4
    // 引数  ：MainActivity
    //         LEDに表示する数字
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：カウンター4に数字を表示する
    // ======================================
    public void SetLedCnt4(MainActivity mainActivity, int num) {
        ImageView set_cnt_4_1;
        ImageView set_cnt_4_2;
        ImageView set_cnt_4_3;
        ImageView set_cnt_4_4;
        set_cnt_4_1 = mainActivity.findViewById(R.id.led_cnt_4_1);
        set_cnt_4_2 = mainActivity.findViewById(R.id.led_cnt_4_2);
        set_cnt_4_3 = mainActivity.findViewById(R.id.led_cnt_4_3);
        set_cnt_4_4 = mainActivity.findViewById(R.id.led_cnt_4_4);

        int num1 = num % 10;                // 1の位を格納
        int num10 = (num / 10) % 10;        // 10の位を格納
        int num100 = (num / 100) % 10;      // 100の位を格納
        int num1000 = (num / 1000) % 10;    // 1000の位を格納

        // 1の位をカウンターにセット
        switch(num1){
            case    0:
                set_cnt_4_1.setImageResource(R.drawable.num_0);
                break;
            case    1:
                set_cnt_4_1.setImageResource(R.drawable.num_1);
                break;
            case    2:
                set_cnt_4_1.setImageResource(R.drawable.num_2);
                break;
            case    3:
                set_cnt_4_1.setImageResource(R.drawable.num_3);
                break;
            case    4:
                set_cnt_4_1.setImageResource(R.drawable.num_4);
                break;
            case    5:
                set_cnt_4_1.setImageResource(R.drawable.num_5);
                break;
            case    6:
                set_cnt_4_1.setImageResource(R.drawable.num_6);
                break;
            case    7:
                set_cnt_4_1.setImageResource(R.drawable.num_7);
                break;
            case    8:
                set_cnt_4_1.setImageResource(R.drawable.num_8);
                break;
            case    9:
                set_cnt_4_1.setImageResource(R.drawable.num_9);
                break;
            default:
                set_cnt_4_1.setImageResource(R.drawable.num_0);
        }

        // 10の位をカウンターにセット
        switch(num10){
            case    0:
                if( num100 > 0 || num1000 > 0 ){
                    set_cnt_4_2.setImageResource(R.drawable.num_0);
                } else {
                    set_cnt_4_2.setImageResource(R.drawable.num_none);
                }
                break;
            case    1:
                set_cnt_4_2.setImageResource(R.drawable.num_1);
                break;
            case    2:
                set_cnt_4_2.setImageResource(R.drawable.num_2);
                break;
            case    3:
                set_cnt_4_2.setImageResource(R.drawable.num_3);
                break;
            case    4:
                set_cnt_4_2.setImageResource(R.drawable.num_4);
                break;
            case    5:
                set_cnt_4_2.setImageResource(R.drawable.num_5);
                break;
            case    6:
                set_cnt_4_2.setImageResource(R.drawable.num_6);
                break;
            case    7:
                set_cnt_4_2.setImageResource(R.drawable.num_7);
                break;
            case    8:
                set_cnt_4_2.setImageResource(R.drawable.num_8);
                break;
            case    9:
                set_cnt_4_2.setImageResource(R.drawable.num_9);
                break;
            default:
                set_cnt_4_2.setImageResource(R.drawable.num_0);
        }

        // 100の位をカウンターにセット
        switch(num100){
            case    0:
                if( num1000 > 0 ) {
                    set_cnt_4_3.setImageResource(R.drawable.num_0);
                } else {
                    set_cnt_4_3.setImageResource(R.drawable.num_none);
                }
                break;
            case    1:
                set_cnt_4_3.setImageResource(R.drawable.num_1);
                break;
            case    2:
                set_cnt_4_3.setImageResource(R.drawable.num_2);
                break;
            case    3:
                set_cnt_4_3.setImageResource(R.drawable.num_3);
                break;
            case    4:
                set_cnt_4_3.setImageResource(R.drawable.num_4);
                break;
            case    5:
                set_cnt_4_3.setImageResource(R.drawable.num_5);
                break;
            case    6:
                set_cnt_4_3.setImageResource(R.drawable.num_6);
                break;
            case    7:
                set_cnt_4_3.setImageResource(R.drawable.num_7);
                break;
            case    8:
                set_cnt_4_3.setImageResource(R.drawable.num_8);
                break;
            case    9:
                set_cnt_4_3.setImageResource(R.drawable.num_9);
                break;
            default:
                if( num1000 > 0 ) {
                    set_cnt_4_3.setImageResource(R.drawable.num_0);
                } else {
                    set_cnt_4_3.setImageResource(R.drawable.num_none);
                }
        }

        // 1000の位をカウンターにセット
        switch(num1000){
            case    0:
                set_cnt_4_4.setImageResource(R.drawable.num_none);
                break;
            case    1:
                set_cnt_4_4.setImageResource(R.drawable.num_1);
                break;
            case    2:
                set_cnt_4_4.setImageResource(R.drawable.num_2);
                break;
            case    3:
                set_cnt_4_4.setImageResource(R.drawable.num_3);
                break;
            case    4:
                set_cnt_4_4.setImageResource(R.drawable.num_4);
                break;
            case    5:
                set_cnt_4_4.setImageResource(R.drawable.num_5);
                break;
            case    6:
                set_cnt_4_4.setImageResource(R.drawable.num_6);
                break;
            case    7:
                set_cnt_4_4.setImageResource(R.drawable.num_7);
                break;
            case    8:
                set_cnt_4_4.setImageResource(R.drawable.num_8);
                break;
            case    9:
                set_cnt_4_4.setImageResource(R.drawable.num_9);
                break;
            default:
                set_cnt_4_4.setImageResource(R.drawable.num_none);
        }
    }

    // ======================================
    // 関数名：SetLedCnt5
    // 引数  ：MainActivity
    //         LEDに表示する数字
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：カウンター5に数字を表示する
    // ======================================
    public void SetLedCnt5(MainActivity mainActivity, int num) {
        ImageView set_cnt_5_1;
        ImageView set_cnt_5_2;
        ImageView set_cnt_5_3;
        ImageView set_cnt_5_4;
        set_cnt_5_1 = mainActivity.findViewById(R.id.led_cnt_5_1);
        set_cnt_5_2 = mainActivity.findViewById(R.id.led_cnt_5_2);
        set_cnt_5_3 = mainActivity.findViewById(R.id.led_cnt_5_3);
        set_cnt_5_4 = mainActivity.findViewById(R.id.led_cnt_5_4);

        int num1 = num % 10;                // 1の位を格納
        int num10 = (num / 10) % 10;        // 10の位を格納
        int num100 = (num / 100) % 10;      // 100の位を格納
        int num1000 = (num / 1000) % 10;    // 1000の位を格納

        // 1の位をカウンターにセット
        switch(num1){
            case    0:
                set_cnt_5_1.setImageResource(R.drawable.num_0);
                break;
            case    1:
                set_cnt_5_1.setImageResource(R.drawable.num_1);
                break;
            case    2:
                set_cnt_5_1.setImageResource(R.drawable.num_2);
                break;
            case    3:
                set_cnt_5_1.setImageResource(R.drawable.num_3);
                break;
            case    4:
                set_cnt_5_1.setImageResource(R.drawable.num_4);
                break;
            case    5:
                set_cnt_5_1.setImageResource(R.drawable.num_5);
                break;
            case    6:
                set_cnt_5_1.setImageResource(R.drawable.num_6);
                break;
            case    7:
                set_cnt_5_1.setImageResource(R.drawable.num_7);
                break;
            case    8:
                set_cnt_5_1.setImageResource(R.drawable.num_8);
                break;
            case    9:
                set_cnt_5_1.setImageResource(R.drawable.num_9);
                break;
            default:
                set_cnt_5_1.setImageResource(R.drawable.num_0);
        }

        // 10の位をカウンターにセット
        switch(num10){
            case    0:
                if( num100 > 0 || num1000 > 0 ){
                    set_cnt_5_2.setImageResource(R.drawable.num_0);
                } else {
                    set_cnt_5_2.setImageResource(R.drawable.num_none);
                }
                break;
            case    1:
                set_cnt_5_2.setImageResource(R.drawable.num_1);
                break;
            case    2:
                set_cnt_5_2.setImageResource(R.drawable.num_2);
                break;
            case    3:
                set_cnt_5_2.setImageResource(R.drawable.num_3);
                break;
            case    4:
                set_cnt_5_2.setImageResource(R.drawable.num_4);
                break;
            case    5:
                set_cnt_5_2.setImageResource(R.drawable.num_5);
                break;
            case    6:
                set_cnt_5_2.setImageResource(R.drawable.num_6);
                break;
            case    7:
                set_cnt_5_2.setImageResource(R.drawable.num_7);
                break;
            case    8:
                set_cnt_5_2.setImageResource(R.drawable.num_8);
                break;
            case    9:
                set_cnt_5_2.setImageResource(R.drawable.num_9);
                break;
            default:
                set_cnt_5_2.setImageResource(R.drawable.num_0);
        }

        // 100の位をカウンターにセット
        switch(num100){
            case    0:
                if( num1000 > 0 ) {
                    set_cnt_5_3.setImageResource(R.drawable.num_0);
                } else {
                    set_cnt_5_3.setImageResource(R.drawable.num_none);
                }
                break;
            case    1:
                set_cnt_5_3.setImageResource(R.drawable.num_1);
                break;
            case    2:
                set_cnt_5_3.setImageResource(R.drawable.num_2);
                break;
            case    3:
                set_cnt_5_3.setImageResource(R.drawable.num_3);
                break;
            case    4:
                set_cnt_5_3.setImageResource(R.drawable.num_4);
                break;
            case    5:
                set_cnt_5_3.setImageResource(R.drawable.num_5);
                break;
            case    6:
                set_cnt_5_3.setImageResource(R.drawable.num_6);
                break;
            case    7:
                set_cnt_5_3.setImageResource(R.drawable.num_7);
                break;
            case    8:
                set_cnt_5_3.setImageResource(R.drawable.num_8);
                break;
            case    9:
                set_cnt_5_3.setImageResource(R.drawable.num_9);
                break;
            default:
                if( num1000 > 0 ) {
                    set_cnt_5_3.setImageResource(R.drawable.num_0);
                } else {
                    set_cnt_5_3.setImageResource(R.drawable.num_none);
                }
        }

        // 1000の位をカウンターにセット
        switch(num1000){
            case    0:
                set_cnt_5_4.setImageResource(R.drawable.num_none);
                break;
            case    1:
                set_cnt_5_4.setImageResource(R.drawable.num_1);
                break;
            case    2:
                set_cnt_5_4.setImageResource(R.drawable.num_2);
                break;
            case    3:
                set_cnt_5_4.setImageResource(R.drawable.num_3);
                break;
            case    4:
                set_cnt_5_4.setImageResource(R.drawable.num_4);
                break;
            case    5:
                set_cnt_5_4.setImageResource(R.drawable.num_5);
                break;
            case    6:
                set_cnt_5_4.setImageResource(R.drawable.num_6);
                break;
            case    7:
                set_cnt_5_4.setImageResource(R.drawable.num_7);
                break;
            case    8:
                set_cnt_5_4.setImageResource(R.drawable.num_8);
                break;
            case    9:
                set_cnt_5_4.setImageResource(R.drawable.num_9);
                break;
            default:
                set_cnt_5_4.setImageResource(R.drawable.num_none);
        }
    }

    // ======================================
    // 関数名：SetLedCnt6
    // 引数  ：MainActivity
    //         LEDに表示する数字
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：カウンター6に数字を表示する
    // ======================================
    public void SetLedCnt6(MainActivity mainActivity, int num) {
        ImageView set_cnt_6_1;
        ImageView set_cnt_6_2;
        ImageView set_cnt_6_3;
        ImageView set_cnt_6_4;
        set_cnt_6_1 = mainActivity.findViewById(R.id.led_cnt_6_1);
        set_cnt_6_2 = mainActivity.findViewById(R.id.led_cnt_6_2);
        set_cnt_6_3 = mainActivity.findViewById(R.id.led_cnt_6_3);
        set_cnt_6_4 = mainActivity.findViewById(R.id.led_cnt_6_4);

        int num1 = num % 10;                // 1の位を格納
        int num10 = (num / 10) % 10;        // 10の位を格納
        int num100 = (num / 100) % 10;      // 100の位を格納
        int num1000 = (num / 1000) % 10;    // 1000の位を格納

        // 1の位をカウンターにセット
        switch(num1){
            case    0:
                set_cnt_6_1.setImageResource(R.drawable.num_0);
                break;
            case    1:
                set_cnt_6_1.setImageResource(R.drawable.num_1);
                break;
            case    2:
                set_cnt_6_1.setImageResource(R.drawable.num_2);
                break;
            case    3:
                set_cnt_6_1.setImageResource(R.drawable.num_3);
                break;
            case    4:
                set_cnt_6_1.setImageResource(R.drawable.num_4);
                break;
            case    5:
                set_cnt_6_1.setImageResource(R.drawable.num_5);
                break;
            case    6:
                set_cnt_6_1.setImageResource(R.drawable.num_6);
                break;
            case    7:
                set_cnt_6_1.setImageResource(R.drawable.num_7);
                break;
            case    8:
                set_cnt_6_1.setImageResource(R.drawable.num_8);
                break;
            case    9:
                set_cnt_6_1.setImageResource(R.drawable.num_9);
                break;
            default:
                set_cnt_6_1.setImageResource(R.drawable.num_0);
        }

        // 10の位をカウンターにセット
        switch(num10){
            case    0:
                if( num100 > 0 || num1000 > 0 ){
                    set_cnt_6_2.setImageResource(R.drawable.num_0);
                } else {
                    set_cnt_6_2.setImageResource(R.drawable.num_none);
                }
                break;
            case    1:
                set_cnt_6_2.setImageResource(R.drawable.num_1);
                break;
            case    2:
                set_cnt_6_2.setImageResource(R.drawable.num_2);
                break;
            case    3:
                set_cnt_6_2.setImageResource(R.drawable.num_3);
                break;
            case    4:
                set_cnt_6_2.setImageResource(R.drawable.num_4);
                break;
            case    5:
                set_cnt_6_2.setImageResource(R.drawable.num_5);
                break;
            case    6:
                set_cnt_6_2.setImageResource(R.drawable.num_6);
                break;
            case    7:
                set_cnt_6_2.setImageResource(R.drawable.num_7);
                break;
            case    8:
                set_cnt_6_2.setImageResource(R.drawable.num_8);
                break;
            case    9:
                set_cnt_6_2.setImageResource(R.drawable.num_9);
                break;
            default:
                set_cnt_6_2.setImageResource(R.drawable.num_0);
        }

        // 100の位をカウンターにセット
        switch(num100){
            case    0:
                if( num1000 > 0 ) {
                    set_cnt_6_3.setImageResource(R.drawable.num_0);
                } else {
                    set_cnt_6_3.setImageResource(R.drawable.num_none);
                }
                break;
            case    1:
                set_cnt_6_3.setImageResource(R.drawable.num_1);
                break;
            case    2:
                set_cnt_6_3.setImageResource(R.drawable.num_2);
                break;
            case    3:
                set_cnt_6_3.setImageResource(R.drawable.num_3);
                break;
            case    4:
                set_cnt_6_3.setImageResource(R.drawable.num_4);
                break;
            case    5:
                set_cnt_6_3.setImageResource(R.drawable.num_5);
                break;
            case    6:
                set_cnt_6_3.setImageResource(R.drawable.num_6);
                break;
            case    7:
                set_cnt_6_3.setImageResource(R.drawable.num_7);
                break;
            case    8:
                set_cnt_6_3.setImageResource(R.drawable.num_8);
                break;
            case    9:
                set_cnt_6_3.setImageResource(R.drawable.num_9);
                break;
            default:
                if( num1000 > 0 ) {
                    set_cnt_6_3.setImageResource(R.drawable.num_0);
                } else {
                    set_cnt_6_3.setImageResource(R.drawable.num_none);
                }
        }

        // 1000の位をカウンターにセット
        switch(num1000){
            case    0:
                set_cnt_6_4.setImageResource(R.drawable.num_none);
                break;
            case    1:
                set_cnt_6_4.setImageResource(R.drawable.num_1);
                break;
            case    2:
                set_cnt_6_4.setImageResource(R.drawable.num_2);
                break;
            case    3:
                set_cnt_6_4.setImageResource(R.drawable.num_3);
                break;
            case    4:
                set_cnt_6_4.setImageResource(R.drawable.num_4);
                break;
            case    5:
                set_cnt_6_4.setImageResource(R.drawable.num_5);
                break;
            case    6:
                set_cnt_6_4.setImageResource(R.drawable.num_6);
                break;
            case    7:
                set_cnt_6_4.setImageResource(R.drawable.num_7);
                break;
            case    8:
                set_cnt_6_4.setImageResource(R.drawable.num_8);
                break;
            case    9:
                set_cnt_6_4.setImageResource(R.drawable.num_9);
                break;
            default:
                set_cnt_6_4.setImageResource(R.drawable.num_none);
        }
    }

    // ======================================
    // 関数名：SetLedPer1
    // 引数  ：MainActivity
    //         カウンター1の数字
    //         カウンター2の数字
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：カウンター1に対するカウンター2の割合を表示
    // ======================================
    public void SetLedPer1(MainActivity mainActivity, int total_num,int num) {
        ImageView set_per_1_1;
        ImageView set_per_1_2;
        ImageView set_per_1_3;
        ImageView set_per_1_4;
        set_per_1_1 = mainActivity.findViewById(R.id.led_per_1_1);
        set_per_1_2 = mainActivity.findViewById(R.id.led_per_1_2);
        set_per_1_3 = mainActivity.findViewById(R.id.led_per_1_3);
        set_per_1_4 = mainActivity.findViewById(R.id.led_per_1_4);

        if( total_num == 0 || num ==0 ) {
            set_per_1_1.setImageResource(R.drawable.num_0);
            set_per_1_2.setImageResource(R.drawable.num_0);
            set_per_1_3.setImageResource(R.drawable.num_none);
            set_per_1_4.setImageResource(R.drawable.num_none);
        } else {
            int result = 0;
            result = (num * 1000) / total_num;

            // 4桁を超える場合は強制的に9999にする
            if( result > 9999 ) {
                result = 9999;
            }
            int num1 = result % 10;                 // 小数点第1位を格納
            int num10 = (result / 10) % 10;         // 1の位を格納
            int num100 = (result / 100) % 10;       // 10の位を格納
            int num1000 = (result / 1000) % 10;     // 100の位を格納

            // 小数点第1位を割合表示にセット
            switch(num1){
                case    0:
                    set_per_1_1.setImageResource(R.drawable.num_0);
                    break;
                case    1:
                    set_per_1_1.setImageResource(R.drawable.num_1);
                    break;
                case    2:
                    set_per_1_1.setImageResource(R.drawable.num_2);
                    break;
                case    3:
                    set_per_1_1.setImageResource(R.drawable.num_3);
                    break;
                case    4:
                    set_per_1_1.setImageResource(R.drawable.num_4);
                    break;
                case    5:
                    set_per_1_1.setImageResource(R.drawable.num_5);
                    break;
                case    6:
                    set_per_1_1.setImageResource(R.drawable.num_6);
                    break;
                case    7:
                    set_per_1_1.setImageResource(R.drawable.num_7);
                    break;
                case    8:
                    set_per_1_1.setImageResource(R.drawable.num_8);
                    break;
                case    9:
                    set_per_1_1.setImageResource(R.drawable.num_9);
                    break;
                default:
                    set_per_1_1.setImageResource(R.drawable.num_0);
            }

            // 1の位を割合表示にセット
            switch(num10){
                case    0:
                    set_per_1_2.setImageResource(R.drawable.num_0);
                    break;
                case    1:
                    set_per_1_2.setImageResource(R.drawable.num_1);
                    break;
                case    2:
                    set_per_1_2.setImageResource(R.drawable.num_2);
                    break;
                case    3:
                    set_per_1_2.setImageResource(R.drawable.num_3);
                    break;
                case    4:
                    set_per_1_2.setImageResource(R.drawable.num_4);
                    break;
                case    5:
                    set_per_1_2.setImageResource(R.drawable.num_5);
                    break;
                case    6:
                    set_per_1_2.setImageResource(R.drawable.num_6);
                    break;
                case    7:
                    set_per_1_2.setImageResource(R.drawable.num_7);
                    break;
                case    8:
                    set_per_1_2.setImageResource(R.drawable.num_8);
                    break;
                case    9:
                    set_per_1_2.setImageResource(R.drawable.num_9);
                    break;
                default:
                    set_per_1_2.setImageResource(R.drawable.num_0);
            }

            // 10の位を割合表示にセット
            switch(num100){
                case    0:
                    if( num1000 > 0 ) {
                        set_per_1_3.setImageResource(R.drawable.num_0);
                    } else {
                        set_per_1_3.setImageResource(R.drawable.num_none);
                    }
                    break;
                case    1:
                    set_per_1_3.setImageResource(R.drawable.num_1);
                    break;
                case    2:
                    set_per_1_3.setImageResource(R.drawable.num_2);
                    break;
                case    3:
                    set_per_1_3.setImageResource(R.drawable.num_3);
                    break;
                case    4:
                    set_per_1_3.setImageResource(R.drawable.num_4);
                    break;
                case    5:
                    set_per_1_3.setImageResource(R.drawable.num_5);
                    break;
                case    6:
                    set_per_1_3.setImageResource(R.drawable.num_6);
                    break;
                case    7:
                    set_per_1_3.setImageResource(R.drawable.num_7);
                    break;
                case    8:
                    set_per_1_3.setImageResource(R.drawable.num_8);
                    break;
                case    9:
                    set_per_1_3.setImageResource(R.drawable.num_9);
                    break;
                default:
                    if( num1000 > 0 ) {
                        set_per_1_3.setImageResource(R.drawable.num_0);
                    } else {
                        set_per_1_3.setImageResource(R.drawable.num_none);
                    }
            }

            // 100の位を割合表示にセット
            switch(num1000){
                case    0:
                    set_per_1_4.setImageResource(R.drawable.num_none);
                    break;
                case    1:
                    set_per_1_4.setImageResource(R.drawable.num_1);
                    break;
                case    2:
                    set_per_1_4.setImageResource(R.drawable.num_2);
                    break;
                case    3:
                    set_per_1_4.setImageResource(R.drawable.num_3);
                    break;
                case    4:
                    set_per_1_4.setImageResource(R.drawable.num_4);
                    break;
                case    5:
                    set_per_1_4.setImageResource(R.drawable.num_5);
                    break;
                case    6:
                    set_per_1_4.setImageResource(R.drawable.num_6);
                    break;
                case    7:
                    set_per_1_4.setImageResource(R.drawable.num_7);
                    break;
                case    8:
                    set_per_1_4.setImageResource(R.drawable.num_8);
                    break;
                case    9:
                    set_per_1_4.setImageResource(R.drawable.num_9);
                    break;
                default:
                    set_per_1_4.setImageResource(R.drawable.num_none);
            }
        }
    }

    // ======================================
    // 関数名：SetLedPer2
    // 引数  ：MainActivity
    //         カウンター1の数字
    //         カウンター3の数字
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：カウンター1に対するカウンター3の割合を表示
    // ======================================
    public void SetLedPer2(MainActivity mainActivity, int total_num,int num) {
        ImageView set_per_2_1;
        ImageView set_per_2_2;
        ImageView set_per_2_3;
        ImageView set_per_2_4;
        set_per_2_1 = mainActivity.findViewById(R.id.led_per_2_1);
        set_per_2_2 = mainActivity.findViewById(R.id.led_per_2_2);
        set_per_2_3 = mainActivity.findViewById(R.id.led_per_2_3);
        set_per_2_4 = mainActivity.findViewById(R.id.led_per_2_4);

        if( total_num == 0 || num ==0 ) {
            set_per_2_1.setImageResource(R.drawable.num_0);
            set_per_2_2.setImageResource(R.drawable.num_0);
            set_per_2_3.setImageResource(R.drawable.num_none);
            set_per_2_4.setImageResource(R.drawable.num_none);
        } else {
            int result = 0;
            result = (num * 1000) / total_num;

            // 4桁を超える場合は強制的に9999にする
            if( result > 9999 ) {
                result = 9999;
            }
            int num1 = result % 10;                 // 小数点第1位を格納
            int num10 = (result / 10) % 10;         // 1の位を格納
            int num100 = (result / 100) % 10;       // 10の位を格納
            int num1000 = (result / 1000) % 10;     // 100の位を格納

            // 小数点第1位を割合表示にセット
            switch(num1){
                case    0:
                    set_per_2_1.setImageResource(R.drawable.num_0);
                    break;
                case    1:
                    set_per_2_1.setImageResource(R.drawable.num_1);
                    break;
                case    2:
                    set_per_2_1.setImageResource(R.drawable.num_2);
                    break;
                case    3:
                    set_per_2_1.setImageResource(R.drawable.num_3);
                    break;
                case    4:
                    set_per_2_1.setImageResource(R.drawable.num_4);
                    break;
                case    5:
                    set_per_2_1.setImageResource(R.drawable.num_5);
                    break;
                case    6:
                    set_per_2_1.setImageResource(R.drawable.num_6);
                    break;
                case    7:
                    set_per_2_1.setImageResource(R.drawable.num_7);
                    break;
                case    8:
                    set_per_2_1.setImageResource(R.drawable.num_8);
                    break;
                case    9:
                    set_per_2_1.setImageResource(R.drawable.num_9);
                    break;
                default:
                    set_per_2_1.setImageResource(R.drawable.num_0);
            }

            // 1の位を割合表示にセット
            switch(num10){
                case    0:
                    set_per_2_2.setImageResource(R.drawable.num_0);
                    break;
                case    1:
                    set_per_2_2.setImageResource(R.drawable.num_1);
                    break;
                case    2:
                    set_per_2_2.setImageResource(R.drawable.num_2);
                    break;
                case    3:
                    set_per_2_2.setImageResource(R.drawable.num_3);
                    break;
                case    4:
                    set_per_2_2.setImageResource(R.drawable.num_4);
                    break;
                case    5:
                    set_per_2_2.setImageResource(R.drawable.num_5);
                    break;
                case    6:
                    set_per_2_2.setImageResource(R.drawable.num_6);
                    break;
                case    7:
                    set_per_2_2.setImageResource(R.drawable.num_7);
                    break;
                case    8:
                    set_per_2_2.setImageResource(R.drawable.num_8);
                    break;
                case    9:
                    set_per_2_2.setImageResource(R.drawable.num_9);
                    break;
                default:
                    set_per_2_2.setImageResource(R.drawable.num_0);
            }

            // 10の位を割合表示にセット
            switch(num100){
                case    0:
                    if( num1000 > 0 ) {
                        set_per_2_3.setImageResource(R.drawable.num_0);
                    } else {
                        set_per_2_3.setImageResource(R.drawable.num_none);
                    }
                    break;
                case    1:
                    set_per_2_3.setImageResource(R.drawable.num_1);
                    break;
                case    2:
                    set_per_2_3.setImageResource(R.drawable.num_2);
                    break;
                case    3:
                    set_per_2_3.setImageResource(R.drawable.num_3);
                    break;
                case    4:
                    set_per_2_3.setImageResource(R.drawable.num_4);
                    break;
                case    5:
                    set_per_2_3.setImageResource(R.drawable.num_5);
                    break;
                case    6:
                    set_per_2_3.setImageResource(R.drawable.num_6);
                    break;
                case    7:
                    set_per_2_3.setImageResource(R.drawable.num_7);
                    break;
                case    8:
                    set_per_2_3.setImageResource(R.drawable.num_8);
                    break;
                case    9:
                    set_per_2_3.setImageResource(R.drawable.num_9);
                    break;
                default:
                    if( num1000 > 0 ) {
                        set_per_2_3.setImageResource(R.drawable.num_0);
                    } else {
                        set_per_2_3.setImageResource(R.drawable.num_none);
                    }
            }

            // 100の位を割合表示にセット
            switch(num1000){
                case    0:
                    set_per_2_4.setImageResource(R.drawable.num_none);
                    break;
                case    1:
                    set_per_2_4.setImageResource(R.drawable.num_1);
                    break;
                case    2:
                    set_per_2_4.setImageResource(R.drawable.num_2);
                    break;
                case    3:
                    set_per_2_4.setImageResource(R.drawable.num_3);
                    break;
                case    4:
                    set_per_2_4.setImageResource(R.drawable.num_4);
                    break;
                case    5:
                    set_per_2_4.setImageResource(R.drawable.num_5);
                    break;
                case    6:
                    set_per_2_4.setImageResource(R.drawable.num_6);
                    break;
                case    7:
                    set_per_2_4.setImageResource(R.drawable.num_7);
                    break;
                case    8:
                    set_per_2_4.setImageResource(R.drawable.num_8);
                    break;
                case    9:
                    set_per_2_4.setImageResource(R.drawable.num_9);
                    break;
                default:
                    set_per_2_4.setImageResource(R.drawable.num_none);
            }
        }
    }

    // 割合表示3出現率を計算してセットする
    // ======================================
    // 関数名：SetLedPer3
    // 引数  ：MainActivity
    //         カウンター1の数字
    //         カウンター4の数字
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：カウンター1に対するカウンター4の割合を表示
    // ======================================
    public void SetLedPer3(MainActivity mainActivity, int total_num,int num) {
        ImageView set_per_3_1;
        ImageView set_per_3_2;
        ImageView set_per_3_3;
        ImageView set_per_3_4;
        set_per_3_1 = mainActivity.findViewById(R.id.led_per_3_1);
        set_per_3_2 = mainActivity.findViewById(R.id.led_per_3_2);
        set_per_3_3 = mainActivity.findViewById(R.id.led_per_3_3);
        set_per_3_4 = mainActivity.findViewById(R.id.led_per_3_4);

        if( total_num == 0 || num ==0 ) {
            set_per_3_1.setImageResource(R.drawable.num_0);
            set_per_3_2.setImageResource(R.drawable.num_0);
            set_per_3_3.setImageResource(R.drawable.num_none);
            set_per_3_4.setImageResource(R.drawable.num_none);
        } else {
            int result = 0;
            result = (num * 1000) / total_num;

            // 4桁を超える場合は強制的に9999にする
            if( result > 9999 ) {
                result = 9999;
            }
            int num1 = result % 10;                 // 小数点第1位を格納
            int num10 = (result / 10) % 10;         // 1の位を格納
            int num100 = (result / 100) % 10;       // 10の位を格納
            int num1000 = (result / 1000) % 10;     // 100の位を格納

            // 小数点第1位を割合表示にセット
            switch(num1){
                case    0:
                    set_per_3_1.setImageResource(R.drawable.num_0);
                    break;
                case    1:
                    set_per_3_1.setImageResource(R.drawable.num_1);
                    break;
                case    2:
                    set_per_3_1.setImageResource(R.drawable.num_2);
                    break;
                case    3:
                    set_per_3_1.setImageResource(R.drawable.num_3);
                    break;
                case    4:
                    set_per_3_1.setImageResource(R.drawable.num_4);
                    break;
                case    5:
                    set_per_3_1.setImageResource(R.drawable.num_5);
                    break;
                case    6:
                    set_per_3_1.setImageResource(R.drawable.num_6);
                    break;
                case    7:
                    set_per_3_1.setImageResource(R.drawable.num_7);
                    break;
                case    8:
                    set_per_3_1.setImageResource(R.drawable.num_8);
                    break;
                case    9:
                    set_per_3_1.setImageResource(R.drawable.num_9);
                    break;
                default:
                    set_per_3_1.setImageResource(R.drawable.num_0);
            }

            // 1の位を割合表示にセット
            switch(num10){
                case    0:
                    set_per_3_2.setImageResource(R.drawable.num_0);
                    break;
                case    1:
                    set_per_3_2.setImageResource(R.drawable.num_1);
                    break;
                case    2:
                    set_per_3_2.setImageResource(R.drawable.num_2);
                    break;
                case    3:
                    set_per_3_2.setImageResource(R.drawable.num_3);
                    break;
                case    4:
                    set_per_3_2.setImageResource(R.drawable.num_4);
                    break;
                case    5:
                    set_per_3_2.setImageResource(R.drawable.num_5);
                    break;
                case    6:
                    set_per_3_2.setImageResource(R.drawable.num_6);
                    break;
                case    7:
                    set_per_3_2.setImageResource(R.drawable.num_7);
                    break;
                case    8:
                    set_per_3_2.setImageResource(R.drawable.num_8);
                    break;
                case    9:
                    set_per_3_2.setImageResource(R.drawable.num_9);
                    break;
                default:
                    set_per_3_2.setImageResource(R.drawable.num_0);
            }

            // 10の位を割合表示にセット
            switch(num100){
                case    0:
                    if( num1000 > 0 ) {
                        set_per_3_3.setImageResource(R.drawable.num_0);
                    } else {
                        set_per_3_3.setImageResource(R.drawable.num_none);
                    }
                    break;
                case    1:
                    set_per_3_3.setImageResource(R.drawable.num_1);
                    break;
                case    2:
                    set_per_3_3.setImageResource(R.drawable.num_2);
                    break;
                case    3:
                    set_per_3_3.setImageResource(R.drawable.num_3);
                    break;
                case    4:
                    set_per_3_3.setImageResource(R.drawable.num_4);
                    break;
                case    5:
                    set_per_3_3.setImageResource(R.drawable.num_5);
                    break;
                case    6:
                    set_per_3_3.setImageResource(R.drawable.num_6);
                    break;
                case    7:
                    set_per_3_3.setImageResource(R.drawable.num_7);
                    break;
                case    8:
                    set_per_3_3.setImageResource(R.drawable.num_8);
                    break;
                case    9:
                    set_per_3_3.setImageResource(R.drawable.num_9);
                    break;
                default:
                    if( num1000 > 0 ) {
                        set_per_3_3.setImageResource(R.drawable.num_0);
                    } else {
                        set_per_3_3.setImageResource(R.drawable.num_none);
                    }
            }

            // 100の位を割合表示にセット
            switch(num1000){
                case    0:
                    set_per_3_4.setImageResource(R.drawable.num_none);
                    break;
                case    1:
                    set_per_3_4.setImageResource(R.drawable.num_1);
                    break;
                case    2:
                    set_per_3_4.setImageResource(R.drawable.num_2);
                    break;
                case    3:
                    set_per_3_4.setImageResource(R.drawable.num_3);
                    break;
                case    4:
                    set_per_3_4.setImageResource(R.drawable.num_4);
                    break;
                case    5:
                    set_per_3_4.setImageResource(R.drawable.num_5);
                    break;
                case    6:
                    set_per_3_4.setImageResource(R.drawable.num_6);
                    break;
                case    7:
                    set_per_3_4.setImageResource(R.drawable.num_7);
                    break;
                case    8:
                    set_per_3_4.setImageResource(R.drawable.num_8);
                    break;
                case    9:
                    set_per_3_4.setImageResource(R.drawable.num_9);
                    break;
                default:
                    set_per_3_4.setImageResource(R.drawable.num_none);
            }
        }
    }

    // ======================================
    // 関数名：SetLedPer4
    // 引数  ：MainActivity
    //         カウンター1の数字
    //         カウンター5の数字
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：カウンター1に対するカウンター5の割合を表示
    // ======================================
    public void SetLedPer4(MainActivity mainActivity, int total_num,int num) {
        ImageView set_per_4_1;
        ImageView set_per_4_2;
        ImageView set_per_4_3;
        ImageView set_per_4_4;
        set_per_4_1 = mainActivity.findViewById(R.id.led_per_4_1);
        set_per_4_2 = mainActivity.findViewById(R.id.led_per_4_2);
        set_per_4_3 = mainActivity.findViewById(R.id.led_per_4_3);
        set_per_4_4 = mainActivity.findViewById(R.id.led_per_4_4);

        if( total_num == 0 || num ==0 ) {
            set_per_4_1.setImageResource(R.drawable.num_0);
            set_per_4_2.setImageResource(R.drawable.num_0);
            set_per_4_3.setImageResource(R.drawable.num_none);
            set_per_4_4.setImageResource(R.drawable.num_none);
        } else {
            int result = 0;
            result = (num * 1000) / total_num;

            // 4桁を超える場合は強制的に9999にする
            if( result > 9999 ) {
                result = 9999;
            }
            int num1 = result % 10;                 // 小数点第1位を格納
            int num10 = (result / 10) % 10;         // 1の位を格納
            int num100 = (result / 100) % 10;       // 10の位を格納
            int num1000 = (result / 1000) % 10;     // 100の位を格納

            // 小数点第1位を割合表示にセット
            switch(num1){
                case    0:
                    set_per_4_1.setImageResource(R.drawable.num_0);
                    break;
                case    1:
                    set_per_4_1.setImageResource(R.drawable.num_1);
                    break;
                case    2:
                    set_per_4_1.setImageResource(R.drawable.num_2);
                    break;
                case    3:
                    set_per_4_1.setImageResource(R.drawable.num_3);
                    break;
                case    4:
                    set_per_4_1.setImageResource(R.drawable.num_4);
                    break;
                case    5:
                    set_per_4_1.setImageResource(R.drawable.num_5);
                    break;
                case    6:
                    set_per_4_1.setImageResource(R.drawable.num_6);
                    break;
                case    7:
                    set_per_4_1.setImageResource(R.drawable.num_7);
                    break;
                case    8:
                    set_per_4_1.setImageResource(R.drawable.num_8);
                    break;
                case    9:
                    set_per_4_1.setImageResource(R.drawable.num_9);
                    break;
                default:
                    set_per_4_1.setImageResource(R.drawable.num_0);
            }

            // 1の位を割合表示にセット
            switch(num10){
                case    0:
                    set_per_4_2.setImageResource(R.drawable.num_0);
                    break;
                case    1:
                    set_per_4_2.setImageResource(R.drawable.num_1);
                    break;
                case    2:
                    set_per_4_2.setImageResource(R.drawable.num_2);
                    break;
                case    3:
                    set_per_4_2.setImageResource(R.drawable.num_3);
                    break;
                case    4:
                    set_per_4_2.setImageResource(R.drawable.num_4);
                    break;
                case    5:
                    set_per_4_2.setImageResource(R.drawable.num_5);
                    break;
                case    6:
                    set_per_4_2.setImageResource(R.drawable.num_6);
                    break;
                case    7:
                    set_per_4_2.setImageResource(R.drawable.num_7);
                    break;
                case    8:
                    set_per_4_2.setImageResource(R.drawable.num_8);
                    break;
                case    9:
                    set_per_4_2.setImageResource(R.drawable.num_9);
                    break;
                default:
                    set_per_4_2.setImageResource(R.drawable.num_0);
            }

            // 10の位を割合表示にセット
            switch(num100){
                case    0:
                    if( num1000 > 0 ) {
                        set_per_4_3.setImageResource(R.drawable.num_0);
                    } else {
                        set_per_4_3.setImageResource(R.drawable.num_none);
                    }
                    break;
                case    1:
                    set_per_4_3.setImageResource(R.drawable.num_1);
                    break;
                case    2:
                    set_per_4_3.setImageResource(R.drawable.num_2);
                    break;
                case    3:
                    set_per_4_3.setImageResource(R.drawable.num_3);
                    break;
                case    4:
                    set_per_4_3.setImageResource(R.drawable.num_4);
                    break;
                case    5:
                    set_per_4_3.setImageResource(R.drawable.num_5);
                    break;
                case    6:
                    set_per_4_3.setImageResource(R.drawable.num_6);
                    break;
                case    7:
                    set_per_4_3.setImageResource(R.drawable.num_7);
                    break;
                case    8:
                    set_per_4_3.setImageResource(R.drawable.num_8);
                    break;
                case    9:
                    set_per_4_3.setImageResource(R.drawable.num_9);
                    break;
                default:
                    if( num1000 > 0 ) {
                        set_per_4_3.setImageResource(R.drawable.num_0);
                    } else {
                        set_per_4_3.setImageResource(R.drawable.num_none);
                    }
            }

            // 100の位を割合表示にセット
            switch(num1000){
                case    0:
                    set_per_4_4.setImageResource(R.drawable.num_none);
                    break;
                case    1:
                    set_per_4_4.setImageResource(R.drawable.num_1);
                    break;
                case    2:
                    set_per_4_4.setImageResource(R.drawable.num_2);
                    break;
                case    3:
                    set_per_4_4.setImageResource(R.drawable.num_3);
                    break;
                case    4:
                    set_per_4_4.setImageResource(R.drawable.num_4);
                    break;
                case    5:
                    set_per_4_4.setImageResource(R.drawable.num_5);
                    break;
                case    6:
                    set_per_4_4.setImageResource(R.drawable.num_6);
                    break;
                case    7:
                    set_per_4_4.setImageResource(R.drawable.num_7);
                    break;
                case    8:
                    set_per_4_4.setImageResource(R.drawable.num_8);
                    break;
                case    9:
                    set_per_4_4.setImageResource(R.drawable.num_9);
                    break;
                default:
                    set_per_4_4.setImageResource(R.drawable.num_none);
            }
        }
    }

    // ======================================
    // 関数名：SetLedPer5
    // 引数  ：MainActivity
    //         カウンター1の数字
    //         カウンター6の数字
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：カウンター1に対するカウンター6の割合を表示
    // ======================================
    public void SetLedPer5(MainActivity mainActivity, int total_num,int num) {
        ImageView set_per_5_1;
        ImageView set_per_5_2;
        ImageView set_per_5_3;
        ImageView set_per_5_4;
        set_per_5_1 = mainActivity.findViewById(R.id.led_per_5_1);
        set_per_5_2 = mainActivity.findViewById(R.id.led_per_5_2);
        set_per_5_3 = mainActivity.findViewById(R.id.led_per_5_3);
        set_per_5_4 = mainActivity.findViewById(R.id.led_per_5_4);

        if( total_num == 0 || num ==0 ) {
            set_per_5_1.setImageResource(R.drawable.num_0);
            set_per_5_2.setImageResource(R.drawable.num_0);
            set_per_5_3.setImageResource(R.drawable.num_none);
            set_per_5_4.setImageResource(R.drawable.num_none);
        } else {
            int result = 0;
            result = (num * 1000) / total_num;

            // 4桁を超える場合は強制的に9999にする
            if( result > 9999 ) {
                result = 9999;
            }
            int num1 = result % 10;                 // 小数点第1位を格納
            int num10 = (result / 10) % 10;         // 1の位を格納
            int num100 = (result / 100) % 10;       // 10の位を格納
            int num1000 = (result / 1000) % 10;     // 100の位を格納

            // 小数点第1位を割合表示にセット
            switch(num1){
                case    0:
                    set_per_5_1.setImageResource(R.drawable.num_0);
                    break;
                case    1:
                    set_per_5_1.setImageResource(R.drawable.num_1);
                    break;
                case    2:
                    set_per_5_1.setImageResource(R.drawable.num_2);
                    break;
                case    3:
                    set_per_5_1.setImageResource(R.drawable.num_3);
                    break;
                case    4:
                    set_per_5_1.setImageResource(R.drawable.num_4);
                    break;
                case    5:
                    set_per_5_1.setImageResource(R.drawable.num_5);
                    break;
                case    6:
                    set_per_5_1.setImageResource(R.drawable.num_6);
                    break;
                case    7:
                    set_per_5_1.setImageResource(R.drawable.num_7);
                    break;
                case    8:
                    set_per_5_1.setImageResource(R.drawable.num_8);
                    break;
                case    9:
                    set_per_5_1.setImageResource(R.drawable.num_9);
                    break;
                default:
                    set_per_5_1.setImageResource(R.drawable.num_0);
            }

            // 1の位を割合表示にセット
            switch(num10){
                case    0:
                    set_per_5_2.setImageResource(R.drawable.num_0);
                    break;
                case    1:
                    set_per_5_2.setImageResource(R.drawable.num_1);
                    break;
                case    2:
                    set_per_5_2.setImageResource(R.drawable.num_2);
                    break;
                case    3:
                    set_per_5_2.setImageResource(R.drawable.num_3);
                    break;
                case    4:
                    set_per_5_2.setImageResource(R.drawable.num_4);
                    break;
                case    5:
                    set_per_5_2.setImageResource(R.drawable.num_5);
                    break;
                case    6:
                    set_per_5_2.setImageResource(R.drawable.num_6);
                    break;
                case    7:
                    set_per_5_2.setImageResource(R.drawable.num_7);
                    break;
                case    8:
                    set_per_5_2.setImageResource(R.drawable.num_8);
                    break;
                case    9:
                    set_per_5_2.setImageResource(R.drawable.num_9);
                    break;
                default:
                    set_per_5_2.setImageResource(R.drawable.num_0);
            }

            // 10の位を割合表示にセット
            switch(num100){
                case    0:
                    if( num1000 > 0 ) {
                        set_per_5_3.setImageResource(R.drawable.num_0);
                    } else {
                        set_per_5_3.setImageResource(R.drawable.num_none);
                    }
                    break;
                case    1:
                    set_per_5_3.setImageResource(R.drawable.num_1);
                    break;
                case    2:
                    set_per_5_3.setImageResource(R.drawable.num_2);
                    break;
                case    3:
                    set_per_5_3.setImageResource(R.drawable.num_3);
                    break;
                case    4:
                    set_per_5_3.setImageResource(R.drawable.num_4);
                    break;
                case    5:
                    set_per_5_3.setImageResource(R.drawable.num_5);
                    break;
                case    6:
                    set_per_5_3.setImageResource(R.drawable.num_6);
                    break;
                case    7:
                    set_per_5_3.setImageResource(R.drawable.num_7);
                    break;
                case    8:
                    set_per_5_3.setImageResource(R.drawable.num_8);
                    break;
                case    9:
                    set_per_5_3.setImageResource(R.drawable.num_9);
                    break;
                default:
                    if( num1000 > 0 ) {
                        set_per_5_3.setImageResource(R.drawable.num_0);
                    } else {
                        set_per_5_3.setImageResource(R.drawable.num_none);
                    }
            }

            // 100の位を割合表示にセット
            switch(num1000){
                case    0:
                    set_per_5_4.setImageResource(R.drawable.num_none);
                    break;
                case    1:
                    set_per_5_4.setImageResource(R.drawable.num_1);
                    break;
                case    2:
                    set_per_5_4.setImageResource(R.drawable.num_2);
                    break;
                case    3:
                    set_per_5_4.setImageResource(R.drawable.num_3);
                    break;
                case    4:
                    set_per_5_4.setImageResource(R.drawable.num_4);
                    break;
                case    5:
                    set_per_5_4.setImageResource(R.drawable.num_5);
                    break;
                case    6:
                    set_per_5_4.setImageResource(R.drawable.num_6);
                    break;
                case    7:
                    set_per_5_4.setImageResource(R.drawable.num_7);
                    break;
                case    8:
                    set_per_5_4.setImageResource(R.drawable.num_8);
                    break;
                case    9:
                    set_per_5_4.setImageResource(R.drawable.num_9);
                    break;
                default:
                    set_per_5_4.setImageResource(R.drawable.num_none);
            }
        }
    }
}
