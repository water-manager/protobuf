// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package dev.igorxp5.proto.api;

public final class Api {
  private Api() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Value_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Value_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreateWaterSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreateWaterSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreateWaterTank_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreateWaterTank_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetWaterTankMinimumVolume_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetWaterTankMinimumVolume_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetWaterTankMaxVolume_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetWaterTankMaxVolume_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetWaterTankZeroVolume_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetWaterTankZeroVolume_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetMode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetMode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetWaterSourceState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetWaterSourceState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetWaterTankList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetWaterTankList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetWaterSourceList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetWaterSourceList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetWaterTankVolume_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetWaterTankVolume_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetWaterTankPressure_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetWaterTankPressure_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetWaterSourceState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetWaterSourceState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RemoveWaterSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RemoveWaterSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RemoveWaterTank_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RemoveWaterTank_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Reset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Reset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetError_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tapi.proto\"\303\004\n\007Request\022\n\n\002id\030\001 \001(\004\022/\n\021c" +
      "reateWaterSource\030\002 \001(\0132\022.CreateWaterSour" +
      "ceH\000\022+\n\017createWaterTank\030\003 \001(\0132\020.CreateWa" +
      "terTankH\000\022?\n\031setWaterTankMinimumVolume\030\004" +
      " \001(\0132\032.SetWaterTankMinimumVolumeH\000\0227\n\025se" +
      "tWaterTankMaxVolume\030\005 \001(\0132\026.SetWaterTank" +
      "MaxVolumeH\000\0229\n\026setWaterTankZeroVolume\030\006 " +
      "\001(\0132\027.SetWaterTankZeroVolumeH\000\022\033\n\007setMod" +
      "e\030\007 \001(\0132\010.SetModeH\000\0223\n\023setWaterSourceSta" +
      "te\030\010 \001(\0132\024.SetWaterSourceStateH\000\0221\n\022getW" +
      "aterTankVolume\030\t \001(\0132\023.GetWaterTankVolum" +
      "eH\000\0225\n\024getWaterTankPressure\030\n \001(\0132\025.GetW" +
      "aterTankPressureH\000\0223\n\023getWaterSourceStat" +
      "e\030\013 \001(\0132\024.GetWaterSourceStateH\000\022\035\n\010GetEr" +
      "ror\030\014 \001(\0132\t.GetErrorH\000B\t\n\007message\"g\n\005Val" +
      "ue\022\023\n\tboolValue\030\002 \001(\010H\000\022\022\n\010intValue\030\003 \001(" +
      "\005H\000\022\025\n\013doubleValue\030\004 \001(\001H\000\022\025\n\013stringVlau" +
      "e\030\005 \001(\tH\000B\007\n\005value\">\n\010Response\022\n\n\002id\030\001 \001" +
      "(\004\022\027\n\007message\030\002 \001(\0132\006.Value\022\r\n\005error\030\003 \001" +
      "(\010\"\\\n\021CreateWaterSource\022\014\n\004name\030\001 \001(\t\022\013\n" +
      "\003pin\030\002 \001(\r\022\032\n\rwaterTankName\030\003 \001(\tH\000\210\001\001B\020" +
      "\n\016_waterTankName\"\200\001\n\017CreateWaterTank\022\014\n\004" +
      "name\030\001 \001(\t\022\027\n\017volumeReaderPin\030\002 \001(\r\022\024\n\014v" +
      "olumeFactor\030\003 \001(\001\022\034\n\017waterSourceName\030\004 \001" +
      "(\tH\000\210\001\001B\022\n\020_waterSourceName\"A\n\031SetWaterT" +
      "ankMinimumVolume\022\025\n\rwaterTankName\030\001 \001(\t\022" +
      "\r\n\005value\030\002 \001(\001\"=\n\025SetWaterTankMaxVolume\022" +
      "\025\n\rwaterTankName\030\001 \001(\t\022\r\n\005value\030\002 \001(\001\">\n" +
      "\026SetWaterTankZeroVolume\022\025\n\rwaterTankName" +
      "\030\001 \001(\t\022\r\n\005value\030\002 \001(\001\"I\n\007SetMode\022\033\n\004mode" +
      "\030\001 \001(\0162\r.SetMode.Mode\"!\n\004Mode\022\r\n\tAUTOMAT" +
      "IC\020\000\022\n\n\006MANUAL\020\001\"=\n\023SetWaterSourceState\022" +
      "\027\n\017waterSourceName\030\001 \001(\t\022\r\n\005state\030\002 \001(\010\"" +
      ")\n\020GetWaterTankList\022\025\n\rwaterTankName\030\001 \003" +
      "(\t\"-\n\022GetWaterSourceList\022\027\n\017waterSourceN" +
      "ame\030\001 \003(\t\"+\n\022GetWaterTankVolume\022\025\n\rwater" +
      "TankName\030\001 \001(\t\"-\n\024GetWaterTankPressure\022\025" +
      "\n\rwaterTankName\030\001 \001(\t\".\n\023GetWaterSourceS" +
      "tate\022\027\n\017waterSourceName\030\001 \001(\t\",\n\021RemoveW" +
      "aterSource\022\027\n\017waterSourceName\030\001 \001(\t\"(\n\017R" +
      "emoveWaterTank\022\025\n\rwaterTankName\030\001 \001(\t\"\007\n" +
      "\005Reset\"\031\n\010GetError\022\r\n\005error\030\001 \003(\tB\031\n\025dev" +
      ".igorxp5.proto.apiP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Request_descriptor,
        new java.lang.String[] { "Id", "CreateWaterSource", "CreateWaterTank", "SetWaterTankMinimumVolume", "SetWaterTankMaxVolume", "SetWaterTankZeroVolume", "SetMode", "SetWaterSourceState", "GetWaterTankVolume", "GetWaterTankPressure", "GetWaterSourceState", "GetError", "Message", });
    internal_static_Value_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Value_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Value_descriptor,
        new java.lang.String[] { "BoolValue", "IntValue", "DoubleValue", "StringVlaue", "Value", });
    internal_static_Response_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Response_descriptor,
        new java.lang.String[] { "Id", "Message", "Error", });
    internal_static_CreateWaterSource_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_CreateWaterSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreateWaterSource_descriptor,
        new java.lang.String[] { "Name", "Pin", "WaterTankName", "WaterTankName", });
    internal_static_CreateWaterTank_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_CreateWaterTank_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreateWaterTank_descriptor,
        new java.lang.String[] { "Name", "VolumeReaderPin", "VolumeFactor", "WaterSourceName", "WaterSourceName", });
    internal_static_SetWaterTankMinimumVolume_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_SetWaterTankMinimumVolume_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetWaterTankMinimumVolume_descriptor,
        new java.lang.String[] { "WaterTankName", "Value", });
    internal_static_SetWaterTankMaxVolume_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_SetWaterTankMaxVolume_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetWaterTankMaxVolume_descriptor,
        new java.lang.String[] { "WaterTankName", "Value", });
    internal_static_SetWaterTankZeroVolume_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_SetWaterTankZeroVolume_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetWaterTankZeroVolume_descriptor,
        new java.lang.String[] { "WaterTankName", "Value", });
    internal_static_SetMode_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_SetMode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetMode_descriptor,
        new java.lang.String[] { "Mode", });
    internal_static_SetWaterSourceState_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_SetWaterSourceState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetWaterSourceState_descriptor,
        new java.lang.String[] { "WaterSourceName", "State", });
    internal_static_GetWaterTankList_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_GetWaterTankList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetWaterTankList_descriptor,
        new java.lang.String[] { "WaterTankName", });
    internal_static_GetWaterSourceList_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_GetWaterSourceList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetWaterSourceList_descriptor,
        new java.lang.String[] { "WaterSourceName", });
    internal_static_GetWaterTankVolume_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_GetWaterTankVolume_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetWaterTankVolume_descriptor,
        new java.lang.String[] { "WaterTankName", });
    internal_static_GetWaterTankPressure_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_GetWaterTankPressure_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetWaterTankPressure_descriptor,
        new java.lang.String[] { "WaterTankName", });
    internal_static_GetWaterSourceState_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_GetWaterSourceState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetWaterSourceState_descriptor,
        new java.lang.String[] { "WaterSourceName", });
    internal_static_RemoveWaterSource_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_RemoveWaterSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RemoveWaterSource_descriptor,
        new java.lang.String[] { "WaterSourceName", });
    internal_static_RemoveWaterTank_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_RemoveWaterTank_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RemoveWaterTank_descriptor,
        new java.lang.String[] { "WaterTankName", });
    internal_static_Reset_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_Reset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Reset_descriptor,
        new java.lang.String[] { });
    internal_static_GetError_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_GetError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetError_descriptor,
        new java.lang.String[] { "Error", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}