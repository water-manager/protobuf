// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package dev.igorxp5.proto.api;

public interface RequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Request)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>.CreateWaterSource createWaterSource = 2;</code>
   * @return Whether the createWaterSource field is set.
   */
  boolean hasCreateWaterSource();
  /**
   * <code>.CreateWaterSource createWaterSource = 2;</code>
   * @return The createWaterSource.
   */
  dev.igorxp5.proto.api.CreateWaterSource getCreateWaterSource();
  /**
   * <code>.CreateWaterSource createWaterSource = 2;</code>
   */
  dev.igorxp5.proto.api.CreateWaterSourceOrBuilder getCreateWaterSourceOrBuilder();

  /**
   * <code>.CreateWaterTank createWaterTank = 3;</code>
   * @return Whether the createWaterTank field is set.
   */
  boolean hasCreateWaterTank();
  /**
   * <code>.CreateWaterTank createWaterTank = 3;</code>
   * @return The createWaterTank.
   */
  dev.igorxp5.proto.api.CreateWaterTank getCreateWaterTank();
  /**
   * <code>.CreateWaterTank createWaterTank = 3;</code>
   */
  dev.igorxp5.proto.api.CreateWaterTankOrBuilder getCreateWaterTankOrBuilder();

  /**
   * <code>.SetWaterTankMinimumVolume setWaterTankMinimumVolume = 4;</code>
   * @return Whether the setWaterTankMinimumVolume field is set.
   */
  boolean hasSetWaterTankMinimumVolume();
  /**
   * <code>.SetWaterTankMinimumVolume setWaterTankMinimumVolume = 4;</code>
   * @return The setWaterTankMinimumVolume.
   */
  dev.igorxp5.proto.api.SetWaterTankMinimumVolume getSetWaterTankMinimumVolume();
  /**
   * <code>.SetWaterTankMinimumVolume setWaterTankMinimumVolume = 4;</code>
   */
  dev.igorxp5.proto.api.SetWaterTankMinimumVolumeOrBuilder getSetWaterTankMinimumVolumeOrBuilder();

  /**
   * <code>.SetWaterTankMaxVolume setWaterTankMaxVolume = 5;</code>
   * @return Whether the setWaterTankMaxVolume field is set.
   */
  boolean hasSetWaterTankMaxVolume();
  /**
   * <code>.SetWaterTankMaxVolume setWaterTankMaxVolume = 5;</code>
   * @return The setWaterTankMaxVolume.
   */
  dev.igorxp5.proto.api.SetWaterTankMaxVolume getSetWaterTankMaxVolume();
  /**
   * <code>.SetWaterTankMaxVolume setWaterTankMaxVolume = 5;</code>
   */
  dev.igorxp5.proto.api.SetWaterTankMaxVolumeOrBuilder getSetWaterTankMaxVolumeOrBuilder();

  /**
   * <code>.SetWaterTankZeroVolume setWaterTankZeroVolume = 6;</code>
   * @return Whether the setWaterTankZeroVolume field is set.
   */
  boolean hasSetWaterTankZeroVolume();
  /**
   * <code>.SetWaterTankZeroVolume setWaterTankZeroVolume = 6;</code>
   * @return The setWaterTankZeroVolume.
   */
  dev.igorxp5.proto.api.SetWaterTankZeroVolume getSetWaterTankZeroVolume();
  /**
   * <code>.SetWaterTankZeroVolume setWaterTankZeroVolume = 6;</code>
   */
  dev.igorxp5.proto.api.SetWaterTankZeroVolumeOrBuilder getSetWaterTankZeroVolumeOrBuilder();

  /**
   * <code>.SetWaterTankVolumeFactor setWaterTankVolumeFactor = 7;</code>
   * @return Whether the setWaterTankVolumeFactor field is set.
   */
  boolean hasSetWaterTankVolumeFactor();
  /**
   * <code>.SetWaterTankVolumeFactor setWaterTankVolumeFactor = 7;</code>
   * @return The setWaterTankVolumeFactor.
   */
  dev.igorxp5.proto.api.SetWaterTankVolumeFactor getSetWaterTankVolumeFactor();
  /**
   * <code>.SetWaterTankVolumeFactor setWaterTankVolumeFactor = 7;</code>
   */
  dev.igorxp5.proto.api.SetWaterTankVolumeFactorOrBuilder getSetWaterTankVolumeFactorOrBuilder();

  /**
   * <code>.SetWaterTankPressureFactor setWaterTankPressureFactor = 8;</code>
   * @return Whether the setWaterTankPressureFactor field is set.
   */
  boolean hasSetWaterTankPressureFactor();
  /**
   * <code>.SetWaterTankPressureFactor setWaterTankPressureFactor = 8;</code>
   * @return The setWaterTankPressureFactor.
   */
  dev.igorxp5.proto.api.SetWaterTankPressureFactor getSetWaterTankPressureFactor();
  /**
   * <code>.SetWaterTankPressureFactor setWaterTankPressureFactor = 8;</code>
   */
  dev.igorxp5.proto.api.SetWaterTankPressureFactorOrBuilder getSetWaterTankPressureFactorOrBuilder();

  /**
   * <code>.SetMode setMode = 9;</code>
   * @return Whether the setMode field is set.
   */
  boolean hasSetMode();
  /**
   * <code>.SetMode setMode = 9;</code>
   * @return The setMode.
   */
  dev.igorxp5.proto.api.SetMode getSetMode();
  /**
   * <code>.SetMode setMode = 9;</code>
   */
  dev.igorxp5.proto.api.SetModeOrBuilder getSetModeOrBuilder();

  /**
   * <code>.GetMode getMode = 10;</code>
   * @return Whether the getMode field is set.
   */
  boolean hasGetMode();
  /**
   * <code>.GetMode getMode = 10;</code>
   * @return The getMode.
   */
  dev.igorxp5.proto.api.GetMode getGetMode();
  /**
   * <code>.GetMode getMode = 10;</code>
   */
  dev.igorxp5.proto.api.GetModeOrBuilder getGetModeOrBuilder();

  /**
   * <code>.SetWaterSourceState setWaterSourceState = 11;</code>
   * @return Whether the setWaterSourceState field is set.
   */
  boolean hasSetWaterSourceState();
  /**
   * <code>.SetWaterSourceState setWaterSourceState = 11;</code>
   * @return The setWaterSourceState.
   */
  dev.igorxp5.proto.api.SetWaterSourceState getSetWaterSourceState();
  /**
   * <code>.SetWaterSourceState setWaterSourceState = 11;</code>
   */
  dev.igorxp5.proto.api.SetWaterSourceStateOrBuilder getSetWaterSourceStateOrBuilder();

  /**
   * <code>.GetWaterSourceList getWaterSourceList = 12;</code>
   * @return Whether the getWaterSourceList field is set.
   */
  boolean hasGetWaterSourceList();
  /**
   * <code>.GetWaterSourceList getWaterSourceList = 12;</code>
   * @return The getWaterSourceList.
   */
  dev.igorxp5.proto.api.GetWaterSourceList getGetWaterSourceList();
  /**
   * <code>.GetWaterSourceList getWaterSourceList = 12;</code>
   */
  dev.igorxp5.proto.api.GetWaterSourceListOrBuilder getGetWaterSourceListOrBuilder();

  /**
   * <code>.GetWaterSource getWaterSource = 13;</code>
   * @return Whether the getWaterSource field is set.
   */
  boolean hasGetWaterSource();
  /**
   * <code>.GetWaterSource getWaterSource = 13;</code>
   * @return The getWaterSource.
   */
  dev.igorxp5.proto.api.GetWaterSource getGetWaterSource();
  /**
   * <code>.GetWaterSource getWaterSource = 13;</code>
   */
  dev.igorxp5.proto.api.GetWaterSourceOrBuilder getGetWaterSourceOrBuilder();

  /**
   * <code>.GetWaterTank getWaterTank = 14;</code>
   * @return Whether the getWaterTank field is set.
   */
  boolean hasGetWaterTank();
  /**
   * <code>.GetWaterTank getWaterTank = 14;</code>
   * @return The getWaterTank.
   */
  dev.igorxp5.proto.api.GetWaterTank getGetWaterTank();
  /**
   * <code>.GetWaterTank getWaterTank = 14;</code>
   */
  dev.igorxp5.proto.api.GetWaterTankOrBuilder getGetWaterTankOrBuilder();

  /**
   * <code>.GetWaterTankList getWaterTankList = 15;</code>
   * @return Whether the getWaterTankList field is set.
   */
  boolean hasGetWaterTankList();
  /**
   * <code>.GetWaterTankList getWaterTankList = 15;</code>
   * @return The getWaterTankList.
   */
  dev.igorxp5.proto.api.GetWaterTankList getGetWaterTankList();
  /**
   * <code>.GetWaterTankList getWaterTankList = 15;</code>
   */
  dev.igorxp5.proto.api.GetWaterTankListOrBuilder getGetWaterTankListOrBuilder();

  /**
   * <code>.RemoveWaterSource removeWaterSource = 16;</code>
   * @return Whether the removeWaterSource field is set.
   */
  boolean hasRemoveWaterSource();
  /**
   * <code>.RemoveWaterSource removeWaterSource = 16;</code>
   * @return The removeWaterSource.
   */
  dev.igorxp5.proto.api.RemoveWaterSource getRemoveWaterSource();
  /**
   * <code>.RemoveWaterSource removeWaterSource = 16;</code>
   */
  dev.igorxp5.proto.api.RemoveWaterSourceOrBuilder getRemoveWaterSourceOrBuilder();

  /**
   * <code>.RemoveWaterTank removeWaterTank = 17;</code>
   * @return Whether the removeWaterTank field is set.
   */
  boolean hasRemoveWaterTank();
  /**
   * <code>.RemoveWaterTank removeWaterTank = 17;</code>
   * @return The removeWaterTank.
   */
  dev.igorxp5.proto.api.RemoveWaterTank getRemoveWaterTank();
  /**
   * <code>.RemoveWaterTank removeWaterTank = 17;</code>
   */
  dev.igorxp5.proto.api.RemoveWaterTankOrBuilder getRemoveWaterTankOrBuilder();

  /**
   * <code>.FillWaterTank fillWaterTank = 18;</code>
   * @return Whether the fillWaterTank field is set.
   */
  boolean hasFillWaterTank();
  /**
   * <code>.FillWaterTank fillWaterTank = 18;</code>
   * @return The fillWaterTank.
   */
  dev.igorxp5.proto.api.FillWaterTank getFillWaterTank();
  /**
   * <code>.FillWaterTank fillWaterTank = 18;</code>
   */
  dev.igorxp5.proto.api.FillWaterTankOrBuilder getFillWaterTankOrBuilder();

  /**
   * <code>.Reset reset = 19;</code>
   * @return Whether the reset field is set.
   */
  boolean hasReset();
  /**
   * <code>.Reset reset = 19;</code>
   * @return The reset.
   */
  dev.igorxp5.proto.api.Reset getReset();
  /**
   * <code>.Reset reset = 19;</code>
   */
  dev.igorxp5.proto.api.ResetOrBuilder getResetOrBuilder();

  public dev.igorxp5.proto.api.Request.MessageCase getMessageCase();
}
