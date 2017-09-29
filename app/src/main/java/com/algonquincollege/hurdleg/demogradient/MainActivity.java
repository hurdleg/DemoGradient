package com.algonquincollege.hurdleg.demogradient;

import android.app.Activity;
import android.os.Bundle;

/**
 * Demonstrate how to put a <SeekBar> widget above an <ImageView>
 *
 * Edit activity_main.xml
 *
 * Steps:
 *   1) Set the top layout to a <RelativeLayout>
 *   2) Add a <Framelayout>
 *   3) To the <FrameLayout>, nest an <ImageView>; set the src property to a PNG image
 *   4) To the <FrameLayout>, nest an <SeekBar>
 *
 * <FrameLayout> is designed to block out an area on the screen to display a single <View> widget.
 *
 * In this demo, we'll nest 2 children <View>s: <ImageView> and <SeekBar>
 * By nesting 2 children, the User will see the <SeekBar> on-top of the <ImageView>
 *
 * PNG assests were made by Prof. Steve.
 *
 * @author Gerald.Hurdle@AlgonquinCollege.com
 * @version 1.0
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
