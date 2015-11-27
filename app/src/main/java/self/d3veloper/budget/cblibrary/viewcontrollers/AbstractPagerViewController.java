package self.d3veloper.budget.cblibrary.viewcontrollers;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;


import java.util.ArrayList;
import java.util.List;


import self.d3veloper.budget.R;
import self.d3veloper.budget.cblibrary.artifacts.AbstractViewPager;
import self.d3veloper.budget.cblibrary.services.ApplicationLoader;
import self.d3veloper.budget.cblibrary.services.MementoHandler;
import self.d3veloper.budget.cblibrary.widgets.AbstractView;


/**
 * Created by Carlos Bedoy on 28/12/2014.
 *
 * Mobile App Developer
 * CBLibrary
 *
 * E-mail: carlos.bedoy@gmail.com
 * Facebook: https://www.facebook.com/carlos.bedoy
 * Github: https://github.com/cbedoy
 */
public class AbstractPagerViewController extends AbstractViewController {

    protected AbstractViewPager abstractViewPager;
    protected ViewPager viewPager;
    protected MementoHandler mementoHandler;
    protected List<AbstractView> viewModel;
    protected List<Object> dataModel;
    protected View background;

    public void setMementoHandler(MementoHandler mementoHandler) {
        this.mementoHandler = mementoHandler;
    }



    @Override
    protected View onCreateView() {
        LayoutInflater inflater = (LayoutInflater) ApplicationLoader.mainContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.mViewController = inflater.inflate(R.layout.cb_library_pager_view_controller,  null);
        this.background = mViewController.findViewById(R.id.view);
        this.viewPager = (ViewPager) mViewController.findViewById(R.id.view_pager);
        this.dataModel = new ArrayList<>();
        this.viewModel = new ArrayList<>();
        return mViewController;
    }

    @Override
    public void onAttachToWindow() {
        super.onAttachToWindow();
    }
}
