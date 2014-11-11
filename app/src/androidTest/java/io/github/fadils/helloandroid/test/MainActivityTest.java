package io.github.fadils.helloandroid.test;

import android.app.Fragment;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import io.github.fadils.helloandroid.MainActivity;
import io.github.fadils.helloandroid.R;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mMainActivity;

    public MainActivityTest() {

        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {

        super.setUp();
        mMainActivity = getActivity();
    }


    /**
     * Make sure that the fragment is added
     */
    public void testFragmentIsAdded() {

        Fragment fragment = mMainActivity.getFragmentManager().findFragmentById(R.id.container);
        assertNotNull(fragment);

    }

    /**
     * Make sure that "Hello Android!" is shown
     */
    public void testShowHelloAndroid() {

        TextView textView = (TextView)mMainActivity.findViewById(R.id.hello_android);

        assertEquals("Hello Android!", textView.getText());

    }

}