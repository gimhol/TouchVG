/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public final class MgContextAction {
  public final static MgContextAction kMgActionInvalid = new MgContextAction("kMgActionInvalid", 0);
  public final static MgContextAction kMgActionSelAll = new MgContextAction("kMgActionSelAll", 1);
  public final static MgContextAction kMgActionSelReset = new MgContextAction("kMgActionSelReset", 2);
  public final static MgContextAction kMgActionDraw = new MgContextAction("kMgActionDraw", 3);
  public final static MgContextAction kMgActionCancel = new MgContextAction("kMgActionCancel", 4);
  public final static MgContextAction kMgActionDelete = new MgContextAction("kMgActionDelete", 5);
  public final static MgContextAction kMgActionClone = new MgContextAction("kMgActionClone", 6);
  public final static MgContextAction kMgActionFixedLength = new MgContextAction("kMgActionFixedLength", 7);
  public final static MgContextAction kMgActionFreeLength = new MgContextAction("kMgActionFreeLength", 8);
  public final static MgContextAction kMgActionLocked = new MgContextAction("kMgActionLocked", 9);
  public final static MgContextAction kMgActionUnlocked = new MgContextAction("kMgActionUnlocked", 10);
  public final static MgContextAction kMgActionEditVertex = new MgContextAction("kMgActionEditVertex", 11);
  public final static MgContextAction kMgActionHideVertex = new MgContextAction("kMgActionHideVertex", 12);
  public final static MgContextAction kMgActionClosed = new MgContextAction("kMgActionClosed", 13);
  public final static MgContextAction kMgActionOpened = new MgContextAction("kMgActionOpened", 14);
  public final static MgContextAction kMgActionAddVertex = new MgContextAction("kMgActionAddVertex", 15);
  public final static MgContextAction kMgActionDelVertex = new MgContextAction("kMgActionDelVertex", 16);
  public final static MgContextAction kMgActionGroup = new MgContextAction("kMgActionGroup", 17);
  public final static MgContextAction kMgActionUngroup = new MgContextAction("kMgActionUngroup", 18);
  public final static MgContextAction kMgActionOverturn = new MgContextAction("kMgActionOverturn", 19);
  public final static MgContextAction kMgActionCustomized = new MgContextAction("kMgActionCustomized", 100);

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static MgContextAction swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + MgContextAction.class + " with value " + swigValue);
  }

  private MgContextAction(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private MgContextAction(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private MgContextAction(String swigName, MgContextAction swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static MgContextAction[] swigValues = { kMgActionInvalid, kMgActionSelAll, kMgActionSelReset, kMgActionDraw, kMgActionCancel, kMgActionDelete, kMgActionClone, kMgActionFixedLength, kMgActionFreeLength, kMgActionLocked, kMgActionUnlocked, kMgActionEditVertex, kMgActionHideVertex, kMgActionClosed, kMgActionOpened, kMgActionAddVertex, kMgActionDelVertex, kMgActionGroup, kMgActionUngroup, kMgActionOverturn, kMgActionCustomized };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

