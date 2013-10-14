/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package touchvg.core;

public class MgView {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected MgView(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MgView obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_MgView(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MgCmdManager cmds() {
    long cPtr = touchvgJNI.MgView_cmds(swigCPtr, this);
    return (cPtr == 0) ? null : new MgCmdManager(cPtr, false);
  }

  public GiTransform xform() {
    long cPtr = touchvgJNI.MgView_xform(swigCPtr, this);
    return (cPtr == 0) ? null : new GiTransform(cPtr, false);
  }

  public GiGraphics graph() {
    long cPtr = touchvgJNI.MgView_graph(swigCPtr, this);
    return (cPtr == 0) ? null : new GiGraphics(cPtr, false);
  }

  public MgShapeDoc doc() {
    long cPtr = touchvgJNI.MgView_doc(swigCPtr, this);
    return (cPtr == 0) ? null : new MgShapeDoc(cPtr, false);
  }

  public MgShapes shapes() {
    long cPtr = touchvgJNI.MgView_shapes(swigCPtr, this);
    return (cPtr == 0) ? null : new MgShapes(cPtr, false);
  }

  public GiContext context() {
    long cPtr = touchvgJNI.MgView_context(swigCPtr, this);
    return (cPtr == 0) ? null : new GiContext(cPtr, false);
  }

  public Matrix2d modelTransform() {
    return new Matrix2d(touchvgJNI.MgView_modelTransform(swigCPtr, this), false);
  }

  public MgShapeFactory getShapeFactory() {
    long cPtr = touchvgJNI.MgView_getShapeFactory(swigCPtr, this);
    return (cPtr == 0) ? null : new MgShapeFactory(cPtr, false);
  }

  public MgSnap getSnap() {
    long cPtr = touchvgJNI.MgView_getSnap(swigCPtr, this);
    return (cPtr == 0) ? null : new MgSnap(cPtr, false);
  }

  public MgActionDispatcher getAction() {
    long cPtr = touchvgJNI.MgView_getAction(swigCPtr, this);
    return (cPtr == 0) ? null : new MgActionDispatcher(cPtr, false);
  }

  public MgLockData getLockData() {
    long cPtr = touchvgJNI.MgView_getLockData(swigCPtr, this);
    return (cPtr == 0) ? null : new MgLockData(cPtr, false);
  }

  public CmdSubject getCmdSubject() {
    long cPtr = touchvgJNI.MgView_getCmdSubject(swigCPtr, this);
    return (cPtr == 0) ? null : new CmdSubject(cPtr, false);
  }

  public MgSelection getSelection() {
    long cPtr = touchvgJNI.MgView_getSelection(swigCPtr, this);
    return (cPtr == 0) ? null : new MgSelection(cPtr, false);
  }

  public boolean setCurrentShapes(MgShapes shapes) {
    return touchvgJNI.MgView_setCurrentShapes(swigCPtr, this, MgShapes.getCPtr(shapes), shapes);
  }

  public boolean toSelectCommand(MgMotion sender) {
    return touchvgJNI.MgView_toSelectCommand(swigCPtr, this, MgMotion.getCPtr(sender), sender);
  }

  public int getNewShapeID() {
    return touchvgJNI.MgView_getNewShapeID(swigCPtr, this);
  }

  public void setNewShapeID(int sid) {
    touchvgJNI.MgView_setNewShapeID(swigCPtr, this, sid);
  }

  public String getCommandName() {
    return touchvgJNI.MgView_getCommandName(swigCPtr, this);
  }

  public MgCommand getCommand() {
    long cPtr = touchvgJNI.MgView_getCommand(swigCPtr, this);
    return (cPtr == 0) ? null : new MgCommand(cPtr, false);
  }

  public MgCommand findCommand(String name) {
    long cPtr = touchvgJNI.MgView_findCommand(swigCPtr, this, name);
    return (cPtr == 0) ? null : new MgCommand(cPtr, false);
  }

  public boolean setCommand(MgMotion sender, String name) {
    return touchvgJNI.MgView_setCommand(swigCPtr, this, MgMotion.getCPtr(sender), sender, name);
  }

  public void regenAll() {
    touchvgJNI.MgView_regenAll(swigCPtr, this);
  }

  public void regenAppend() {
    touchvgJNI.MgView_regenAppend(swigCPtr, this);
  }

  public void redraw() {
    touchvgJNI.MgView_redraw(swigCPtr, this);
  }

  public boolean useFinger() {
    return touchvgJNI.MgView_useFinger(swigCPtr, this);
  }

  public void commandChanged() {
    touchvgJNI.MgView_commandChanged(swigCPtr, this);
  }

  public void selectionChanged() {
    touchvgJNI.MgView_selectionChanged(swigCPtr, this);
  }

  public boolean shapeWillAdded(MgShape shape) {
    return touchvgJNI.MgView_shapeWillAdded(swigCPtr, this, MgShape.getCPtr(shape), shape);
  }

  public void shapeAdded(MgShape shape) {
    touchvgJNI.MgView_shapeAdded(swigCPtr, this, MgShape.getCPtr(shape), shape);
  }

  public boolean shapeWillDeleted(MgShape shape) {
    return touchvgJNI.MgView_shapeWillDeleted(swigCPtr, this, MgShape.getCPtr(shape), shape);
  }

  public boolean removeShape(MgShape shape) {
    return touchvgJNI.MgView_removeShape(swigCPtr, this, MgShape.getCPtr(shape), shape);
  }

  public boolean shapeCanRotated(MgShape shape) {
    return touchvgJNI.MgView_shapeCanRotated(swigCPtr, this, MgShape.getCPtr(shape), shape);
  }

  public boolean shapeCanTransform(MgShape shape) {
    return touchvgJNI.MgView_shapeCanTransform(swigCPtr, this, MgShape.getCPtr(shape), shape);
  }

  public boolean shapeCanUnlock(MgShape shape) {
    return touchvgJNI.MgView_shapeCanUnlock(swigCPtr, this, MgShape.getCPtr(shape), shape);
  }

  public boolean shapeCanUngroup(MgShape shape) {
    return touchvgJNI.MgView_shapeCanUngroup(swigCPtr, this, MgShape.getCPtr(shape), shape);
  }

  public void shapeMoved(MgShape shape, int segment) {
    touchvgJNI.MgView_shapeMoved(swigCPtr, this, MgShape.getCPtr(shape), shape, segment);
  }

  public boolean isContextActionsVisible() {
    return touchvgJNI.MgView_isContextActionsVisible(swigCPtr, this);
  }

}
