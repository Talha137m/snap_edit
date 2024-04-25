package talha.akram.SnapEdit.editimage.interfaces;


public interface OnPhotoEditorListener {
    void onAddViewListener(int numberOfAddedViews);

    void onRemoveViewListener(int numberOfAddedViews);

    void onStartViewChangeListener();

    void onStopViewChangeListener();
}
