/* Automatically generated nanopb header */
/* Generated by nanopb-0.4.5 */

#ifndef PB_API_PB_H_INCLUDED
#define PB_API_PB_H_INCLUDED
#include <pb.h>

#if PB_PROTO_HEADER_VERSION != 40
#error Regenerate this file with the current version of nanopb generator.
#endif

/* Enum definitions */
typedef enum _Error_Exception { 
    Error_Exception_EXCEPTION = 0, 
    Error_Exception_RUNTIME_ERROR = 1, 
    Error_Exception_INVALID_REQUEST = 2 
} Error_Exception;

typedef enum _SetMode_Mode { 
    SetMode_Mode_MANUAL = 0, 
    SetMode_Mode_AUTO = 1 
} SetMode_Mode;

/* Struct definitions */
typedef struct _GetMode { 
    char dummy_field;
} GetMode;

typedef struct _GetWaterSourceList { 
    char dummy_field;
} GetWaterSourceList;

typedef struct _GetWaterTankList { 
    char dummy_field;
} GetWaterTankList;

typedef struct _Reset { 
    char dummy_field;
} Reset;

typedef struct _CreateWaterSource { 
    char name[21]; 
    uint32_t pin; 
    bool has_waterTankName;
    char waterTankName[21]; 
} CreateWaterSource;

typedef struct _CreateWaterTank { 
    char name[21]; 
    uint32_t pressureSensorPin; 
    float volumeFactor; 
    float pressureFactor; 
    bool has_waterSourceName;
    char waterSourceName[21]; 
} CreateWaterTank;

typedef struct _Error { 
    char message[101]; 
    Error_Exception type; 
    char arg[21]; 
} Error;

typedef struct _FillWaterTank { 
    char waterTankName[21]; 
    bool enabled; 
    bool force; 
} FillWaterTank;

typedef struct _GetWaterSource { 
    char waterSourceName[21]; 
} GetWaterSource;

typedef struct _GetWaterTank { 
    char waterTankName[21]; 
} GetWaterTank;

typedef struct _PrimitiveValue { 
    pb_size_t which_content;
    union {
        bool boolValue;
        int32_t intValue;
        float floatValue;
        char stringValue[101];
    } content; 
} PrimitiveValue;

typedef struct _RemoveWaterSource { 
    char waterSourceName[21]; 
} RemoveWaterSource;

typedef struct _RemoveWaterTank { 
    char waterTankName[21]; 
} RemoveWaterTank;

typedef struct _SetMode { 
    SetMode_Mode mode; 
} SetMode;

typedef struct _SetWaterSourceActive { 
    char waterSourceName[21]; 
    bool active; 
} SetWaterSourceActive;

typedef struct _SetWaterSourceState { 
    char waterSourceName[21]; 
    bool state; 
    bool force; 
} SetWaterSourceState;

typedef struct _SetWaterTankActive { 
    char waterTankName[21]; 
    bool active; 
} SetWaterTankActive;

typedef struct _SetWaterTankMaxVolume { 
    char waterTankName[21]; 
    float value; 
} SetWaterTankMaxVolume;

typedef struct _SetWaterTankMinimumVolume { 
    char waterTankName[21]; 
    float value; 
} SetWaterTankMinimumVolume;

typedef struct _SetWaterTankPressureChangingValue { 
    char waterTankName[21]; 
    float value; 
} SetWaterTankPressureChangingValue;

typedef struct _SetWaterTankPressureFactor { 
    char waterTankName[21]; 
    float value; 
} SetWaterTankPressureFactor;

typedef struct _SetWaterTankVolumeFactor { 
    char waterTankName[21]; 
    float value; 
} SetWaterTankVolumeFactor;

typedef struct _SetWaterTankZeroVolume { 
    char waterTankName[21]; 
    float value; 
} SetWaterTankZeroVolume;

typedef struct _WaterSourceState { 
    char name[21]; 
    uint32_t pin; 
    bool active; 
    bool turnedOn; 
    bool has_sourceWaterTank;
    char sourceWaterTank[21]; 
} WaterSourceState;

typedef struct _WaterTankState { 
    char name[21]; 
    uint32_t pressureSensorPin; 
    bool filling; 
    bool active; 
    float volumeFactor; 
    float pressureFactor; 
    float minimumVolume; 
    float maxVolume; 
    float zeroVolumePressure; 
    float pressureChangingValue; 
    uint32_t rawPressureValue; 
    float pressure; 
    float volume; 
    bool has_waterSource;
    char waterSource[21]; 
} WaterTankState;

typedef struct _Request { 
    uint32_t id; 
    pb_size_t which_message;
    union {
        CreateWaterSource createWaterSource;
        CreateWaterTank createWaterTank;
        SetWaterTankMinimumVolume setWaterTankMinimumVolume;
        SetWaterTankMaxVolume setWaterTankMaxVolume;
        SetWaterTankZeroVolume setWaterTankZeroVolume;
        SetWaterTankVolumeFactor setWaterTankVolumeFactor;
        SetWaterTankPressureFactor setWaterTankPressureFactor;
        SetWaterTankPressureChangingValue setWaterTankPressureChangingValue;
        SetWaterTankActive setWaterTankActive;
        SetMode setMode;
        GetMode getMode;
        SetWaterSourceState setWaterSourceState;
        SetWaterSourceActive setWaterSourceActive;
        GetWaterSourceList getWaterSourceList;
        GetWaterSource getWaterSource;
        GetWaterTank getWaterTank;
        GetWaterTankList getWaterTankList;
        RemoveWaterSource removeWaterSource;
        RemoveWaterTank removeWaterTank;
        FillWaterTank fillWaterTank;
        Reset reset;
    } message; 
} Request;

typedef struct _Value { 
    bool has_value;
    PrimitiveValue value; 
    pb_size_t listValue_count;
    PrimitiveValue listValue[10]; 
    bool has_waterSource;
    WaterSourceState waterSource; 
    bool has_waterTank;
    WaterTankState waterTank; 
} Value;

typedef struct _Response { 
    uint32_t id; 
    pb_size_t which_content;
    union {
        Value message;
        Error error;
    } content; 
} Response;


/* Helper constants for enums */
#define _Error_Exception_MIN Error_Exception_EXCEPTION
#define _Error_Exception_MAX Error_Exception_INVALID_REQUEST
#define _Error_Exception_ARRAYSIZE ((Error_Exception)(Error_Exception_INVALID_REQUEST+1))

#define _SetMode_Mode_MIN SetMode_Mode_MANUAL
#define _SetMode_Mode_MAX SetMode_Mode_AUTO
#define _SetMode_Mode_ARRAYSIZE ((SetMode_Mode)(SetMode_Mode_AUTO+1))


#ifdef __cplusplus
extern "C" {
#endif

/* Initializer values for message structs */
#define Request_init_default                     {0, 0, {CreateWaterSource_init_default}}
#define PrimitiveValue_init_default              {0, {0}}
#define Value_init_default                       {false, PrimitiveValue_init_default, 0, {PrimitiveValue_init_default, PrimitiveValue_init_default, PrimitiveValue_init_default, PrimitiveValue_init_default, PrimitiveValue_init_default, PrimitiveValue_init_default, PrimitiveValue_init_default, PrimitiveValue_init_default, PrimitiveValue_init_default, PrimitiveValue_init_default}, false, WaterSourceState_init_default, false, WaterTankState_init_default}
#define Response_init_default                    {0, 0, {Value_init_default}}
#define Error_init_default                       {"", _Error_Exception_MIN, ""}
#define CreateWaterSource_init_default           {"", 0, false, ""}
#define CreateWaterTank_init_default             {"", 0, 0, 0, false, ""}
#define SetWaterTankMinimumVolume_init_default   {"", 0}
#define SetWaterTankMaxVolume_init_default       {"", 0}
#define SetWaterTankZeroVolume_init_default      {"", 0}
#define SetWaterTankVolumeFactor_init_default    {"", 0}
#define SetWaterTankPressureFactor_init_default  {"", 0}
#define SetWaterTankPressureChangingValue_init_default {"", 0}
#define SetWaterTankActive_init_default          {"", 0}
#define SetMode_init_default                     {_SetMode_Mode_MIN}
#define GetMode_init_default                     {0}
#define SetWaterSourceState_init_default         {"", 0, 0}
#define SetWaterSourceActive_init_default        {"", 0}
#define GetWaterTankList_init_default            {0}
#define GetWaterSourceList_init_default          {0}
#define GetWaterSource_init_default              {""}
#define GetWaterTank_init_default                {""}
#define RemoveWaterSource_init_default           {""}
#define RemoveWaterTank_init_default             {""}
#define FillWaterTank_init_default               {"", 0, 0}
#define Reset_init_default                       {0}
#define WaterSourceState_init_default            {"", 0, 0, 0, false, ""}
#define WaterTankState_init_default              {"", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, ""}
#define Request_init_zero                        {0, 0, {CreateWaterSource_init_zero}}
#define PrimitiveValue_init_zero                 {0, {0}}
#define Value_init_zero                          {false, PrimitiveValue_init_zero, 0, {PrimitiveValue_init_zero, PrimitiveValue_init_zero, PrimitiveValue_init_zero, PrimitiveValue_init_zero, PrimitiveValue_init_zero, PrimitiveValue_init_zero, PrimitiveValue_init_zero, PrimitiveValue_init_zero, PrimitiveValue_init_zero, PrimitiveValue_init_zero}, false, WaterSourceState_init_zero, false, WaterTankState_init_zero}
#define Response_init_zero                       {0, 0, {Value_init_zero}}
#define Error_init_zero                          {"", _Error_Exception_MIN, ""}
#define CreateWaterSource_init_zero              {"", 0, false, ""}
#define CreateWaterTank_init_zero                {"", 0, 0, 0, false, ""}
#define SetWaterTankMinimumVolume_init_zero      {"", 0}
#define SetWaterTankMaxVolume_init_zero          {"", 0}
#define SetWaterTankZeroVolume_init_zero         {"", 0}
#define SetWaterTankVolumeFactor_init_zero       {"", 0}
#define SetWaterTankPressureFactor_init_zero     {"", 0}
#define SetWaterTankPressureChangingValue_init_zero {"", 0}
#define SetWaterTankActive_init_zero             {"", 0}
#define SetMode_init_zero                        {_SetMode_Mode_MIN}
#define GetMode_init_zero                        {0}
#define SetWaterSourceState_init_zero            {"", 0, 0}
#define SetWaterSourceActive_init_zero           {"", 0}
#define GetWaterTankList_init_zero               {0}
#define GetWaterSourceList_init_zero             {0}
#define GetWaterSource_init_zero                 {""}
#define GetWaterTank_init_zero                   {""}
#define RemoveWaterSource_init_zero              {""}
#define RemoveWaterTank_init_zero                {""}
#define FillWaterTank_init_zero                  {"", 0, 0}
#define Reset_init_zero                          {0}
#define WaterSourceState_init_zero               {"", 0, 0, 0, false, ""}
#define WaterTankState_init_zero                 {"", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, ""}

/* Field tags (for use in manual encoding/decoding) */
#define CreateWaterSource_name_tag               1
#define CreateWaterSource_pin_tag                2
#define CreateWaterSource_waterTankName_tag      3
#define CreateWaterTank_name_tag                 1
#define CreateWaterTank_pressureSensorPin_tag    2
#define CreateWaterTank_volumeFactor_tag         3
#define CreateWaterTank_pressureFactor_tag       4
#define CreateWaterTank_waterSourceName_tag      5
#define Error_message_tag                        1
#define Error_type_tag                           2
#define Error_arg_tag                            3
#define FillWaterTank_waterTankName_tag          1
#define FillWaterTank_enabled_tag                2
#define FillWaterTank_force_tag                  3
#define GetWaterSource_waterSourceName_tag       1
#define GetWaterTank_waterTankName_tag           1
#define PrimitiveValue_boolValue_tag             2
#define PrimitiveValue_intValue_tag              3
#define PrimitiveValue_floatValue_tag            4
#define PrimitiveValue_stringValue_tag           5
#define RemoveWaterSource_waterSourceName_tag    1
#define RemoveWaterTank_waterTankName_tag        1
#define SetMode_mode_tag                         1
#define SetWaterSourceActive_waterSourceName_tag 1
#define SetWaterSourceActive_active_tag          2
#define SetWaterSourceState_waterSourceName_tag  1
#define SetWaterSourceState_state_tag            2
#define SetWaterSourceState_force_tag            3
#define SetWaterTankActive_waterTankName_tag     1
#define SetWaterTankActive_active_tag            2
#define SetWaterTankMaxVolume_waterTankName_tag  1
#define SetWaterTankMaxVolume_value_tag          2
#define SetWaterTankMinimumVolume_waterTankName_tag 1
#define SetWaterTankMinimumVolume_value_tag      2
#define SetWaterTankPressureChangingValue_waterTankName_tag 1
#define SetWaterTankPressureChangingValue_value_tag 2
#define SetWaterTankPressureFactor_waterTankName_tag 1
#define SetWaterTankPressureFactor_value_tag     2
#define SetWaterTankVolumeFactor_waterTankName_tag 1
#define SetWaterTankVolumeFactor_value_tag       2
#define SetWaterTankZeroVolume_waterTankName_tag 1
#define SetWaterTankZeroVolume_value_tag         2
#define WaterSourceState_name_tag                1
#define WaterSourceState_pin_tag                 2
#define WaterSourceState_active_tag              3
#define WaterSourceState_turnedOn_tag            4
#define WaterSourceState_sourceWaterTank_tag     5
#define WaterTankState_name_tag                  1
#define WaterTankState_pressureSensorPin_tag     2
#define WaterTankState_filling_tag               3
#define WaterTankState_active_tag                4
#define WaterTankState_volumeFactor_tag          5
#define WaterTankState_pressureFactor_tag        6
#define WaterTankState_minimumVolume_tag         7
#define WaterTankState_maxVolume_tag             8
#define WaterTankState_zeroVolumePressure_tag    9
#define WaterTankState_pressureChangingValue_tag 10
#define WaterTankState_rawPressureValue_tag      11
#define WaterTankState_pressure_tag              12
#define WaterTankState_volume_tag                13
#define WaterTankState_waterSource_tag           14
#define Request_id_tag                           1
#define Request_createWaterSource_tag            2
#define Request_createWaterTank_tag              3
#define Request_setWaterTankMinimumVolume_tag    4
#define Request_setWaterTankMaxVolume_tag        5
#define Request_setWaterTankZeroVolume_tag       6
#define Request_setWaterTankVolumeFactor_tag     7
#define Request_setWaterTankPressureFactor_tag   8
#define Request_setWaterTankPressureChangingValue_tag 9
#define Request_setWaterTankActive_tag           10
#define Request_setMode_tag                      11
#define Request_getMode_tag                      12
#define Request_setWaterSourceState_tag          13
#define Request_setWaterSourceActive_tag         14
#define Request_getWaterSourceList_tag           15
#define Request_getWaterSource_tag               16
#define Request_getWaterTank_tag                 17
#define Request_getWaterTankList_tag             18
#define Request_removeWaterSource_tag            19
#define Request_removeWaterTank_tag              20
#define Request_fillWaterTank_tag                21
#define Request_reset_tag                        22
#define Value_value_tag                          1
#define Value_listValue_tag                      2
#define Value_waterSource_tag                    3
#define Value_waterTank_tag                      4
#define Response_id_tag                          1
#define Response_message_tag                     2
#define Response_error_tag                       3

/* Struct field encoding specification for nanopb */
#define Request_FIELDLIST(X, a) \
X(a, STATIC,   SINGULAR, UINT32,   id,                1) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,createWaterSource,message.createWaterSource),   2) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,createWaterTank,message.createWaterTank),   3) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,setWaterTankMinimumVolume,message.setWaterTankMinimumVolume),   4) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,setWaterTankMaxVolume,message.setWaterTankMaxVolume),   5) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,setWaterTankZeroVolume,message.setWaterTankZeroVolume),   6) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,setWaterTankVolumeFactor,message.setWaterTankVolumeFactor),   7) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,setWaterTankPressureFactor,message.setWaterTankPressureFactor),   8) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,setWaterTankPressureChangingValue,message.setWaterTankPressureChangingValue),   9) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,setWaterTankActive,message.setWaterTankActive),  10) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,setMode,message.setMode),  11) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,getMode,message.getMode),  12) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,setWaterSourceState,message.setWaterSourceState),  13) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,setWaterSourceActive,message.setWaterSourceActive),  14) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,getWaterSourceList,message.getWaterSourceList),  15) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,getWaterSource,message.getWaterSource),  16) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,getWaterTank,message.getWaterTank),  17) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,getWaterTankList,message.getWaterTankList),  18) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,removeWaterSource,message.removeWaterSource),  19) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,removeWaterTank,message.removeWaterTank),  20) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,fillWaterTank,message.fillWaterTank),  21) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,reset,message.reset),  22)
#define Request_CALLBACK NULL
#define Request_DEFAULT NULL
#define Request_message_createWaterSource_MSGTYPE CreateWaterSource
#define Request_message_createWaterTank_MSGTYPE CreateWaterTank
#define Request_message_setWaterTankMinimumVolume_MSGTYPE SetWaterTankMinimumVolume
#define Request_message_setWaterTankMaxVolume_MSGTYPE SetWaterTankMaxVolume
#define Request_message_setWaterTankZeroVolume_MSGTYPE SetWaterTankZeroVolume
#define Request_message_setWaterTankVolumeFactor_MSGTYPE SetWaterTankVolumeFactor
#define Request_message_setWaterTankPressureFactor_MSGTYPE SetWaterTankPressureFactor
#define Request_message_setWaterTankPressureChangingValue_MSGTYPE SetWaterTankPressureChangingValue
#define Request_message_setWaterTankActive_MSGTYPE SetWaterTankActive
#define Request_message_setMode_MSGTYPE SetMode
#define Request_message_getMode_MSGTYPE GetMode
#define Request_message_setWaterSourceState_MSGTYPE SetWaterSourceState
#define Request_message_setWaterSourceActive_MSGTYPE SetWaterSourceActive
#define Request_message_getWaterSourceList_MSGTYPE GetWaterSourceList
#define Request_message_getWaterSource_MSGTYPE GetWaterSource
#define Request_message_getWaterTank_MSGTYPE GetWaterTank
#define Request_message_getWaterTankList_MSGTYPE GetWaterTankList
#define Request_message_removeWaterSource_MSGTYPE RemoveWaterSource
#define Request_message_removeWaterTank_MSGTYPE RemoveWaterTank
#define Request_message_fillWaterTank_MSGTYPE FillWaterTank
#define Request_message_reset_MSGTYPE Reset

#define PrimitiveValue_FIELDLIST(X, a) \
X(a, STATIC,   ONEOF,    BOOL,     (content,boolValue,content.boolValue),   2) \
X(a, STATIC,   ONEOF,    INT32,    (content,intValue,content.intValue),   3) \
X(a, STATIC,   ONEOF,    FLOAT,    (content,floatValue,content.floatValue),   4) \
X(a, STATIC,   ONEOF,    STRING,   (content,stringValue,content.stringValue),   5)
#define PrimitiveValue_CALLBACK NULL
#define PrimitiveValue_DEFAULT NULL

#define Value_FIELDLIST(X, a) \
X(a, STATIC,   OPTIONAL, MESSAGE,  value,             1) \
X(a, STATIC,   REPEATED, MESSAGE,  listValue,         2) \
X(a, STATIC,   OPTIONAL, MESSAGE,  waterSource,       3) \
X(a, STATIC,   OPTIONAL, MESSAGE,  waterTank,         4)
#define Value_CALLBACK NULL
#define Value_DEFAULT NULL
#define Value_value_MSGTYPE PrimitiveValue
#define Value_listValue_MSGTYPE PrimitiveValue
#define Value_waterSource_MSGTYPE WaterSourceState
#define Value_waterTank_MSGTYPE WaterTankState

#define Response_FIELDLIST(X, a) \
X(a, STATIC,   SINGULAR, UINT32,   id,                1) \
X(a, STATIC,   ONEOF,    MESSAGE,  (content,message,content.message),   2) \
X(a, STATIC,   ONEOF,    MESSAGE,  (content,error,content.error),   3)
#define Response_CALLBACK NULL
#define Response_DEFAULT NULL
#define Response_content_message_MSGTYPE Value
#define Response_content_error_MSGTYPE Error

#define Error_FIELDLIST(X, a) \
X(a, STATIC,   SINGULAR, STRING,   message,           1) \
X(a, STATIC,   SINGULAR, UENUM,    type,              2) \
X(a, STATIC,   SINGULAR, STRING,   arg,               3)
#define Error_CALLBACK NULL
#define Error_DEFAULT NULL

#define CreateWaterSource_FIELDLIST(X, a) \
X(a, STATIC,   SINGULAR, STRING,   name,              1) \
X(a, STATIC,   SINGULAR, UINT32,   pin,               2) \
X(a, STATIC,   OPTIONAL, STRING,   waterTankName,     3)
#define CreateWaterSource_CALLBACK NULL
#define CreateWaterSource_DEFAULT NULL

#define CreateWaterTank_FIELDLIST(X, a) \
X(a, STATIC,   SINGULAR, STRING,   name,              1) \
X(a, STATIC,   SINGULAR, UINT32,   pressureSensorPin,   2) \
X(a, STATIC,   SINGULAR, FLOAT,    volumeFactor,      3) \
X(a, STATIC,   SINGULAR, FLOAT,    pressureFactor,    4) \
X(a, STATIC,   OPTIONAL, STRING,   waterSourceName,   5)
#define CreateWaterTank_CALLBACK NULL
#define CreateWaterTank_DEFAULT NULL

#define SetWaterTankMinimumVolume_FIELDLIST(X, a) \
X(a, STATIC,   SINGULAR, STRING,   waterTankName,     1) \
X(a, STATIC,   SINGULAR, FLOAT,    value,             2)
#define SetWaterTankMinimumVolume_CALLBACK NULL
#define SetWaterTankMinimumVolume_DEFAULT NULL

#define SetWaterTankMaxVolume_FIELDLIST(X, a) \
X(a, STATIC,   SINGULAR, STRING,   waterTankName,     1) \
X(a, STATIC,   SINGULAR, FLOAT,    value,             2)
#define SetWaterTankMaxVolume_CALLBACK NULL
#define SetWaterTankMaxVolume_DEFAULT NULL

#define SetWaterTankZeroVolume_FIELDLIST(X, a) \
X(a, STATIC,   SINGULAR, STRING,   waterTankName,     1) \
X(a, STATIC,   SINGULAR, FLOAT,    value,             2)
#define SetWaterTankZeroVolume_CALLBACK NULL
#define SetWaterTankZeroVolume_DEFAULT NULL

#define SetWaterTankVolumeFactor_FIELDLIST(X, a) \
X(a, STATIC,   SINGULAR, STRING,   waterTankName,     1) \
X(a, STATIC,   SINGULAR, FLOAT,    value,             2)
#define SetWaterTankVolumeFactor_CALLBACK NULL
#define SetWaterTankVolumeFactor_DEFAULT NULL

#define SetWaterTankPressureFactor_FIELDLIST(X, a) \
X(a, STATIC,   SINGULAR, STRING,   waterTankName,     1) \
X(a, STATIC,   SINGULAR, FLOAT,    value,             2)
#define SetWaterTankPressureFactor_CALLBACK NULL
#define SetWaterTankPressureFactor_DEFAULT NULL

#define SetWaterTankPressureChangingValue_FIELDLIST(X, a) \
X(a, STATIC,   SINGULAR, STRING,   waterTankName,     1) \
X(a, STATIC,   SINGULAR, FLOAT,    value,             2)
#define SetWaterTankPressureChangingValue_CALLBACK NULL
#define SetWaterTankPressureChangingValue_DEFAULT NULL

#define SetWaterTankActive_FIELDLIST(X, a) \
X(a, STATIC,   SINGULAR, STRING,   waterTankName,     1) \
X(a, STATIC,   SINGULAR, BOOL,     active,            2)
#define SetWaterTankActive_CALLBACK NULL
#define SetWaterTankActive_DEFAULT NULL

#define SetMode_FIELDLIST(X, a) \
X(a, STATIC,   SINGULAR, UENUM,    mode,              1)
#define SetMode_CALLBACK NULL
#define SetMode_DEFAULT NULL

#define GetMode_FIELDLIST(X, a) \

#define GetMode_CALLBACK NULL
#define GetMode_DEFAULT NULL

#define SetWaterSourceState_FIELDLIST(X, a) \
X(a, STATIC,   SINGULAR, STRING,   waterSourceName,   1) \
X(a, STATIC,   SINGULAR, BOOL,     state,             2) \
X(a, STATIC,   SINGULAR, BOOL,     force,             3)
#define SetWaterSourceState_CALLBACK NULL
#define SetWaterSourceState_DEFAULT NULL

#define SetWaterSourceActive_FIELDLIST(X, a) \
X(a, STATIC,   SINGULAR, STRING,   waterSourceName,   1) \
X(a, STATIC,   SINGULAR, BOOL,     active,            2)
#define SetWaterSourceActive_CALLBACK NULL
#define SetWaterSourceActive_DEFAULT NULL

#define GetWaterTankList_FIELDLIST(X, a) \

#define GetWaterTankList_CALLBACK NULL
#define GetWaterTankList_DEFAULT NULL

#define GetWaterSourceList_FIELDLIST(X, a) \

#define GetWaterSourceList_CALLBACK NULL
#define GetWaterSourceList_DEFAULT NULL

#define GetWaterSource_FIELDLIST(X, a) \
X(a, STATIC,   SINGULAR, STRING,   waterSourceName,   1)
#define GetWaterSource_CALLBACK NULL
#define GetWaterSource_DEFAULT NULL

#define GetWaterTank_FIELDLIST(X, a) \
X(a, STATIC,   SINGULAR, STRING,   waterTankName,     1)
#define GetWaterTank_CALLBACK NULL
#define GetWaterTank_DEFAULT NULL

#define RemoveWaterSource_FIELDLIST(X, a) \
X(a, STATIC,   SINGULAR, STRING,   waterSourceName,   1)
#define RemoveWaterSource_CALLBACK NULL
#define RemoveWaterSource_DEFAULT NULL

#define RemoveWaterTank_FIELDLIST(X, a) \
X(a, STATIC,   SINGULAR, STRING,   waterTankName,     1)
#define RemoveWaterTank_CALLBACK NULL
#define RemoveWaterTank_DEFAULT NULL

#define FillWaterTank_FIELDLIST(X, a) \
X(a, STATIC,   SINGULAR, STRING,   waterTankName,     1) \
X(a, STATIC,   SINGULAR, BOOL,     enabled,           2) \
X(a, STATIC,   SINGULAR, BOOL,     force,             3)
#define FillWaterTank_CALLBACK NULL
#define FillWaterTank_DEFAULT NULL

#define Reset_FIELDLIST(X, a) \

#define Reset_CALLBACK NULL
#define Reset_DEFAULT NULL

#define WaterSourceState_FIELDLIST(X, a) \
X(a, STATIC,   SINGULAR, STRING,   name,              1) \
X(a, STATIC,   SINGULAR, UINT32,   pin,               2) \
X(a, STATIC,   SINGULAR, BOOL,     active,            3) \
X(a, STATIC,   SINGULAR, BOOL,     turnedOn,          4) \
X(a, STATIC,   OPTIONAL, STRING,   sourceWaterTank,   5)
#define WaterSourceState_CALLBACK NULL
#define WaterSourceState_DEFAULT NULL

#define WaterTankState_FIELDLIST(X, a) \
X(a, STATIC,   SINGULAR, STRING,   name,              1) \
X(a, STATIC,   SINGULAR, UINT32,   pressureSensorPin,   2) \
X(a, STATIC,   SINGULAR, BOOL,     filling,           3) \
X(a, STATIC,   SINGULAR, BOOL,     active,            4) \
X(a, STATIC,   SINGULAR, FLOAT,    volumeFactor,      5) \
X(a, STATIC,   SINGULAR, FLOAT,    pressureFactor,    6) \
X(a, STATIC,   SINGULAR, FLOAT,    minimumVolume,     7) \
X(a, STATIC,   SINGULAR, FLOAT,    maxVolume,         8) \
X(a, STATIC,   SINGULAR, FLOAT,    zeroVolumePressure,   9) \
X(a, STATIC,   SINGULAR, FLOAT,    pressureChangingValue,  10) \
X(a, STATIC,   SINGULAR, UINT32,   rawPressureValue,  11) \
X(a, STATIC,   SINGULAR, FLOAT,    pressure,         12) \
X(a, STATIC,   SINGULAR, FLOAT,    volume,           13) \
X(a, STATIC,   OPTIONAL, STRING,   waterSource,      14)
#define WaterTankState_CALLBACK NULL
#define WaterTankState_DEFAULT NULL

extern const pb_msgdesc_t Request_msg;
extern const pb_msgdesc_t PrimitiveValue_msg;
extern const pb_msgdesc_t Value_msg;
extern const pb_msgdesc_t Response_msg;
extern const pb_msgdesc_t Error_msg;
extern const pb_msgdesc_t CreateWaterSource_msg;
extern const pb_msgdesc_t CreateWaterTank_msg;
extern const pb_msgdesc_t SetWaterTankMinimumVolume_msg;
extern const pb_msgdesc_t SetWaterTankMaxVolume_msg;
extern const pb_msgdesc_t SetWaterTankZeroVolume_msg;
extern const pb_msgdesc_t SetWaterTankVolumeFactor_msg;
extern const pb_msgdesc_t SetWaterTankPressureFactor_msg;
extern const pb_msgdesc_t SetWaterTankPressureChangingValue_msg;
extern const pb_msgdesc_t SetWaterTankActive_msg;
extern const pb_msgdesc_t SetMode_msg;
extern const pb_msgdesc_t GetMode_msg;
extern const pb_msgdesc_t SetWaterSourceState_msg;
extern const pb_msgdesc_t SetWaterSourceActive_msg;
extern const pb_msgdesc_t GetWaterTankList_msg;
extern const pb_msgdesc_t GetWaterSourceList_msg;
extern const pb_msgdesc_t GetWaterSource_msg;
extern const pb_msgdesc_t GetWaterTank_msg;
extern const pb_msgdesc_t RemoveWaterSource_msg;
extern const pb_msgdesc_t RemoveWaterTank_msg;
extern const pb_msgdesc_t FillWaterTank_msg;
extern const pb_msgdesc_t Reset_msg;
extern const pb_msgdesc_t WaterSourceState_msg;
extern const pb_msgdesc_t WaterTankState_msg;

/* Defines for backwards compatibility with code written before nanopb-0.4.0 */
#define Request_fields &Request_msg
#define PrimitiveValue_fields &PrimitiveValue_msg
#define Value_fields &Value_msg
#define Response_fields &Response_msg
#define Error_fields &Error_msg
#define CreateWaterSource_fields &CreateWaterSource_msg
#define CreateWaterTank_fields &CreateWaterTank_msg
#define SetWaterTankMinimumVolume_fields &SetWaterTankMinimumVolume_msg
#define SetWaterTankMaxVolume_fields &SetWaterTankMaxVolume_msg
#define SetWaterTankZeroVolume_fields &SetWaterTankZeroVolume_msg
#define SetWaterTankVolumeFactor_fields &SetWaterTankVolumeFactor_msg
#define SetWaterTankPressureFactor_fields &SetWaterTankPressureFactor_msg
#define SetWaterTankPressureChangingValue_fields &SetWaterTankPressureChangingValue_msg
#define SetWaterTankActive_fields &SetWaterTankActive_msg
#define SetMode_fields &SetMode_msg
#define GetMode_fields &GetMode_msg
#define SetWaterSourceState_fields &SetWaterSourceState_msg
#define SetWaterSourceActive_fields &SetWaterSourceActive_msg
#define GetWaterTankList_fields &GetWaterTankList_msg
#define GetWaterSourceList_fields &GetWaterSourceList_msg
#define GetWaterSource_fields &GetWaterSource_msg
#define GetWaterTank_fields &GetWaterTank_msg
#define RemoveWaterSource_fields &RemoveWaterSource_msg
#define RemoveWaterTank_fields &RemoveWaterTank_msg
#define FillWaterTank_fields &FillWaterTank_msg
#define Reset_fields &Reset_msg
#define WaterSourceState_fields &WaterSourceState_msg
#define WaterTankState_fields &WaterTankState_msg

/* Maximum encoded size of messages (where known) */
#define CreateWaterSource_size                   50
#define CreateWaterTank_size                     60
#define Error_size                               126
#define FillWaterTank_size                       26
#define GetMode_size                             0
#define GetWaterSourceList_size                  0
#define GetWaterSource_size                      22
#define GetWaterTankList_size                    0
#define GetWaterTank_size                        22
#define PrimitiveValue_size                      102
#define RemoveWaterSource_size                   22
#define RemoveWaterTank_size                     22
#define Request_size                             68
#define Reset_size                               0
#define Response_size                            1311
#define SetMode_size                             2
#define SetWaterSourceActive_size                24
#define SetWaterSourceState_size                 26
#define SetWaterTankActive_size                  24
#define SetWaterTankMaxVolume_size               27
#define SetWaterTankMinimumVolume_size           27
#define SetWaterTankPressureChangingValue_size   27
#define SetWaterTankPressureFactor_size          27
#define SetWaterTankVolumeFactor_size            27
#define SetWaterTankZeroVolume_size              27
#define Value_size                               1302
#define WaterSourceState_size                    54
#define WaterTankState_size                      100

#ifdef __cplusplus
} /* extern "C" */
#endif

#endif
