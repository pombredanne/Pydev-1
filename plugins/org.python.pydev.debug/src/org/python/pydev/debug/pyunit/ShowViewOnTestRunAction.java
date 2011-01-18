package org.python.pydev.debug.pyunit;

import java.lang.ref.WeakReference;

import org.eclipse.jface.action.Action;
import org.python.pydev.debug.core.PydevDebugPlugin;

public class ShowViewOnTestRunAction extends Action{

    private WeakReference<PyUnitView> pyUnitView;

    public ShowViewOnTestRunAction(PyUnitView pyUnitView) {
        this.pyUnitView = new WeakReference<PyUnitView>(pyUnitView);
        this.setChecked(getShowViewOnTestRun());
        this.setText("Show unittest view on a new unittest run");
        this.setToolTipText("If checked, shows the view on a new unittest run.");
    }

    @Override
    public void run() {
        setShowViewOnTestRun(this.isChecked());
    }
    
    
    public static boolean getShowViewOnTestRun(){
        return PydevDebugPlugin.getDefault().getPreferenceStore().getBoolean(PyUnitView.PYUNIT_VIEW_SHOW_VIEW_ON_TEST_RUN);
    }
    
    public static void setShowViewOnTestRun(boolean b){
        PydevDebugPlugin.getDefault().getPreferenceStore().setValue(PyUnitView.PYUNIT_VIEW_SHOW_VIEW_ON_TEST_RUN, b);
    }
}
