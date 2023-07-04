package dksofttech.takenote.app.view.pflockscreen.security.callbacks;

import dksofttech.takenote.app.view.pflockscreen.security.PFResult;

public interface PFPinCodeHelperCallback<T> {
    void onResult(PFResult<T> result);
}
