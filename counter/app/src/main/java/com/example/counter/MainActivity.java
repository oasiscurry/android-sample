// ==============================================================================
// プログラム名：アンプ風カウンター
// 作成者      ：shingo.yoshioka
// 作成日      ：2019年07月02日(火)
// 更新日      ：2019年07月02日(火)
// 概要        ：Androidのカウンターアプリメイン処理
// ==============================================================================
package com.example.counter;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private LedController led;
    private int counter1;
    private int counter2;
    private int counter3;
    private int counter4;
    private int counter5;
    private int counter6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ledコントローラーのインスタンス作成
        led = new LedController(this);

        // カウンターの初期化
        counter1 = 0;
        counter2 = 0;
        counter3 = 0;
        counter4 = 0;
        counter5 = 0;
        counter6 = 0;
    }

    // ======================================
    // 関数名：onClickBtnUp1
    // 引数  ：View
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：▲ボタン1押下時の処理
    //         カウンター1の数字を+1する
    // ======================================
    public void onClickBtnUp1(View view) {
        if( counter1 < 9999 ) {
            counter1++;
            led.SetLedCnt1(this,counter1);
            led.SetLedPer1(this, counter1, counter2 );
            led.SetLedPer2(this, counter1, counter3 );
            led.SetLedPer3(this, counter1, counter4 );
            led.SetLedPer4(this, counter1, counter5 );
            led.SetLedPer5(this, counter1, counter6 );
        }
    }

    // ======================================
    // 関数名：onClickBtnUp2
    // 引数  ：View
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：▲ボタン2押下時の処理
    //         カウンター2の数字を+1する
    // ======================================
    public void onClickBtnUp2(View view) {
        if( counter2 < 9999 ) {
            counter2++;
            led.SetLedCnt2(this,counter2);
            led.SetLedPer1(this, counter1, counter2 );
        }
    }

    // ======================================
    // 関数名：onClickBtnUp3
    // 引数  ：View
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：▲ボタン6押下時の処理
    //         カウンター6の数字を+1する
    // ======================================
    public void onClickBtnUp3(View view) {
        if( counter3 < 9999 ) {
            counter3++;
            led.SetLedCnt3(this,counter3);
            led.SetLedPer2(this, counter1, counter3 );
        }
    }

    // ======================================
    // 関数名：onClickBtnUp4
    // 引数  ：View
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：▲ボタン4押下時の処理
    //         カウンター4の数字を+1する
    // ======================================
    public void onClickBtnUp4(View view) {
        if( counter4 < 9999 ) {
            counter4++;
            led.SetLedCnt4(this,counter4);
            led.SetLedPer3(this, counter1, counter4 );
        }
    }

    // ======================================
    // 関数名：onClickBtnUp5
    // 引数  ：View
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：▲ボタン5押下時の処理
    //         カウンター5の数字を+1する
    // ======================================
    public void onClickBtnUp5(View view) {
        if( counter5 < 9999 ) {
            counter5++;
            led.SetLedCnt5(this,counter5);
            led.SetLedPer4(this, counter1, counter5 );
        }
    }

    // ======================================
    // 関数名：onClickBtnUp6
    // 引数  ：View
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：▲ボタン6押下時の処理
    //         カウンター6の数字を+1する
    // ======================================
    public void onClickBtnUp6(View view) {
        if( counter6 < 9999 ) {
            counter6++;
            led.SetLedCnt6(this,counter6);
            led.SetLedPer5(this, counter1, counter6 );
        }
    }

    // ======================================
    // 関数名：onClickBtnDown1
    // 引数  ：View
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：▼ボタン1押下時の処理
    //         カウンター1の数字を-1する
    // ======================================
    public void onClickBtnDown1(View view) {
        if( counter1 > 0 ) {
            counter1--;
            led.SetLedCnt1(this,counter1);

            led.SetLedPer1(this, counter1, counter2 );
            led.SetLedPer2(this, counter1, counter3 );
            led.SetLedPer3(this, counter1, counter4 );
            led.SetLedPer4(this, counter1, counter5 );
            led.SetLedPer5(this, counter1, counter6 );
        }
    }

    // ======================================
    // 関数名：onClickBtnDown2
    // 引数  ：View
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：▼ボタン2押下時の処理
    //         カウンター2の数字を-1する
    // ======================================
    public void onClickBtnDown2(View view) {
        if( counter2 > 0 ) {
            counter2--;
            led.SetLedCnt2(this,counter2);
            led.SetLedPer1(this, counter1, counter2 );
        }
    }

    // ======================================
    // 関数名：onClickBtnDown3
    // 引数  ：View
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：▼ボタン3押下時の処理
    //         カウンター3の数字を-1する
    // ======================================
    public void onClickBtnDown3(View view) {
        if( counter3 > 0 ) {
            counter3--;
            led.SetLedCnt3(this,counter3);
            led.SetLedPer2(this, counter1, counter3 );
        }
    }

    // ======================================
    // 関数名：onClickBtnDown4
    // 引数  ：View
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：▼ボタン4押下時の処理
    //         カウンター4の数字を-1する
    // ======================================
    public void onClickBtnDown4(View view) {
        if( counter4 > 0 ) {
            counter4--;
            led.SetLedCnt4(this,counter4);
            led.SetLedPer3(this, counter1, counter4 );
        }
    }

    // ======================================
    // 関数名：onClickBtnDown5
    // 引数  ：View
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：▼ボタン5押下時の処理
    //         カウンター5の数字を-1する
    // ======================================
    public void onClickBtnDown5(View view) {
        if( counter5 > 0 ) {
            counter5--;
            led.SetLedCnt5(this,counter5);
            led.SetLedPer4(this, counter1, counter5 );
        }
    }

    // ======================================
    // 関数名：onClickBtnDown6
    // 引数  ：View
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：▼ボタン6押下時の処理
    //         カウンター6の数字を-1する
    // ======================================
    public void onClickBtnDown6(View view) {
        if( counter6 > 0 ) {
            counter6--;
            led.SetLedCnt6(this,counter6);
            led.SetLedPer5(this, counter1, counter6 );
        }
    }

    // ======================================
    // 関数名：onClickBtnReset1
    // 引数  ：View
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：Resetボタン1押下時の処理
    //         カウンター1を0にする
    // ======================================
    public void onClickBtnReset1(View view) {
        counter1 = 0;
        led.SetLedCnt1(this,counter1);

        led.SetLedPer1(this, counter1, counter2 );
        led.SetLedPer2(this, counter1, counter3 );
        led.SetLedPer3(this, counter1, counter4 );
        led.SetLedPer4(this, counter1, counter5 );
        led.SetLedPer5(this, counter1, counter6 );
    }

    // ======================================
    // 関数名：onClickBtnReset2
    // 引数  ：View
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：Resetボタン2押下時の処理
    //         カウンター2を0にする
    // ======================================
    public void onClickBtnReset2(View view) {
        counter2 = 0;
        led.SetLedCnt2(this,counter2);
        led.SetLedPer1(this, counter1, counter2 );
    }

    // ======================================
    // 関数名：onClickBtnReset3
    // 引数  ：View
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：Resetボタン3押下時の処理
    //         カウンター3を0にする
    // ======================================
    public void onClickBtnReset3(View view) {
        counter3 = 0;
        led.SetLedCnt3(this,counter3);
        led.SetLedPer2(this, counter1, counter3 );
    }

    // ======================================
    // 関数名：onClickBtnReset4
    // 引数  ：View
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：Resetボタン4押下時の処理
    //         カウンター4を0にする
    // ======================================
    public void onClickBtnReset4(View view) {
        counter4 = 0;
        led.SetLedCnt4(this,counter4);
        led.SetLedPer3(this, counter1, counter4 );
    }

    // ======================================
    // 関数名：onClickBtnReset5
    // 引数  ：View
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：Resetボタン5押下時の処理
    //         カウンター5を0にする
    // ======================================
    public void onClickBtnReset5(View view) {
        counter5 = 0;
        led.SetLedCnt5(this, counter5 );
        led.SetLedPer4(this, counter1, counter5 );
    }

    // ======================================
    // 関数名：onClickBtnReset6
    // 引数  ：View
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：Resetボタン6押下時の処理
    //         カウンター6を0にする
    // ======================================
    public void onClickBtnReset6(View view) {
        counter6 = 0;
        led.SetLedCnt6(this, counter6 );
        led.SetLedPer5(this, counter1, counter6);
    }

    // ======================================
    // 関数名：onClickBtnAllReset
    // 引数  ：View
    // 戻り値：なし
    // 作成者：shingo.yoshioka
    // 作成日：2019年07月02日(火)
    // 更新日：2019年07月02日(火)
    // 概要  ：All Resetボタン押下時の処理
    //         カウンターを全て0にする
    // ======================================
    public void onClickBtnAllReset(View view) {
        counter1 = 0;
        counter2 = 0;
        counter3 = 0;
        counter4 = 0;
        counter5 = 0;
        counter6 = 0;

        led.SetLedCnt1(this, counter1 );
        led.SetLedCnt2(this, counter2 );
        led.SetLedCnt3(this, counter3 );
        led.SetLedCnt4(this, counter4 );
        led.SetLedCnt5(this, counter5 );
        led.SetLedCnt6(this, counter6 );

        led.SetLedPer1(this, counter1, counter2 );
        led.SetLedPer2(this, counter1, counter3 );
        led.SetLedPer3(this, counter1, counter4 );
        led.SetLedPer4(this, counter1, counter5 );
        led.SetLedPer5(this, counter1, counter6 );
    }
}
