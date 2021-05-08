/* Automatically generated nanopb header */
/* Generated by nanopb-0.4.5 */

#ifndef PB_API_PB_H_INCLUDED
#define PB_API_PB_H_INCLUDED
#include <pb.h>

#if PB_PROTO_HEADER_VERSION != 40
#error Regenerate this file with the current version of nanopb generator.
#endif

/* Enum definitions */
typedef enum _SetMode_Mode { 
    SetMode_Mode_AUTOMATIC = 0, 
    SetMode_Mode_MANUAL = 1 
} SetMode_Mode;

/* Struct definitions */
typedef struct _GetError { 
    pb_callback_t error; 
} GetError;

typedef struct _GetWaterSourceList { 
    pb_callback_t waterSourceName; 
} GetWaterSourceList;

typedef struct _GetWaterSourceState { 
    pb_callback_t waterSourceName; 
} GetWaterSourceState;

typedef struct _GetWaterTankList { 
    pb_callback_t waterTankName; 
} GetWaterTankList;

typedef struct _GetWaterTankPressure { 
    pb_callback_t waterTankName; 
} GetWaterTankPressure;

typedef struct _GetWaterTankVolume { 
    pb_callback_t waterTankName; 
} GetWaterTankVolume;

typedef struct _RemoveWaterSource { 
    pb_callback_t waterSourceName; 
} RemoveWaterSource;

typedef struct _RemoveWaterTank { 
    pb_callback_t waterTankName; 
} RemoveWaterTank;

typedef struct _Reset { 
    char dummy_field;
} Reset;

typedef struct _CreateWaterSource { 
    pb_callback_t name; 
    uint32_t pin; 
    pb_callback_t waterTankName; 
} CreateWaterSource;

typedef struct _CreateWaterTank { 
    pb_callback_t name; 
    uint32_t volumeReaderPin; 
    double volumeFactor; 
    double pressureFactor; 
    pb_callback_t waterSourceName; 
} CreateWaterTank;

typedef struct _SetMode { 
    SetMode_Mode mode; 
} SetMode;

typedef struct _SetWaterSourceState { 
    pb_callback_t waterSourceName; 
    bool state; 
} SetWaterSourceState;

typedef struct _SetWaterTankMaxVolume { 
    pb_callback_t waterTankName; 
    double value; 
} SetWaterTankMaxVolume;

typedef struct _SetWaterTankMinimumVolume { 
    pb_callback_t waterTankName; 
    double value; 
} SetWaterTankMinimumVolume;

typedef struct _SetWaterTankZeroVolume { 
    pb_callback_t waterTankName; 
    double value; 
} SetWaterTankZeroVolume;

typedef struct _Value { 
    pb_size_t which_value;
    union {
        bool boolValue;
        int32_t intValue;
        double doubleValue;
        pb_callback_t stringVlaue;
    } value; 
} Value;

typedef struct _Request { 
    uint64_t id; 
    pb_size_t which_message;
    union {
        CreateWaterSource createWaterSource;
        CreateWaterTank createWaterTank;
        SetWaterTankMinimumVolume setWaterTankMinimumVolume;
        SetWaterTankMaxVolume setWaterTankMaxVolume;
        SetWaterTankZeroVolume setWaterTankZeroVolume;
        SetMode setMode;
        SetWaterSourceState setWaterSourceState;
        GetWaterSourceList getWaterSourceList;
        GetWaterTankList getWaterTankList;
        GetWaterTankVolume getWaterTankVolume;
        GetWaterTankPressure getWaterTankPressure;
        GetWaterSourceState getWaterSourceState;
        GetError GetError;
        RemoveWaterSource removeWaterSource;
        RemoveWaterTank removeWaterTank;
        Reset reset;
    } message; 
} Request;

typedef struct _Response { 
    uint64_t id; 
    bool has_message;
    Value message; 
    bool error; 
} Response;


/* Helper constants for enums */
#define _SetMode_Mode_MIN SetMode_Mode_AUTOMATIC
#define _SetMode_Mode_MAX SetMode_Mode_MANUAL
#define _SetMode_Mode_ARRAYSIZE ((SetMode_Mode)(SetMode_Mode_MANUAL+1))


#ifdef __cplusplus
extern "C" {
#endif

/* Initializer values for message structs */
#define Request_init_default                     {0, 0, {CreateWaterSource_init_default}}
#define Value_init_default                       {0, {0}}
#define Response_init_default                    {0, false, Value_init_default, 0}
#define CreateWaterSource_init_default           {{{NULL}, NULL}, 0, {{NULL}, NULL}}
#define CreateWaterTank_init_default             {{{NULL}, NULL}, 0, 0, 0, {{NULL}, NULL}}
#define SetWaterTankMinimumVolume_init_default   {{{NULL}, NULL}, 0}
#define SetWaterTankMaxVolume_init_default       {{{NULL}, NULL}, 0}
#define SetWaterTankZeroVolume_init_default      {{{NULL}, NULL}, 0}
#define SetMode_init_default                     {_SetMode_Mode_MIN}
#define SetWaterSourceState_init_default         {{{NULL}, NULL}, 0}
#define GetWaterTankList_init_default            {{{NULL}, NULL}}
#define GetWaterSourceList_init_default          {{{NULL}, NULL}}
#define GetWaterTankVolume_init_default          {{{NULL}, NULL}}
#define GetWaterTankPressure_init_default        {{{NULL}, NULL}}
#define GetWaterSourceState_init_default         {{{NULL}, NULL}}
#define RemoveWaterSource_init_default           {{{NULL}, NULL}}
#define RemoveWaterTank_init_default             {{{NULL}, NULL}}
#define Reset_init_default                       {0}
#define GetError_init_default                    {{{NULL}, NULL}}
#define Request_init_zero                        {0, 0, {CreateWaterSource_init_zero}}
#define Value_init_zero                          {0, {0}}
#define Response_init_zero                       {0, false, Value_init_zero, 0}
#define CreateWaterSource_init_zero              {{{NULL}, NULL}, 0, {{NULL}, NULL}}
#define CreateWaterTank_init_zero                {{{NULL}, NULL}, 0, 0, 0, {{NULL}, NULL}}
#define SetWaterTankMinimumVolume_init_zero      {{{NULL}, NULL}, 0}
#define SetWaterTankMaxVolume_init_zero          {{{NULL}, NULL}, 0}
#define SetWaterTankZeroVolume_init_zero         {{{NULL}, NULL}, 0}
#define SetMode_init_zero                        {_SetMode_Mode_MIN}
#define SetWaterSourceState_init_zero            {{{NULL}, NULL}, 0}
#define GetWaterTankList_init_zero               {{{NULL}, NULL}}
#define GetWaterSourceList_init_zero             {{{NULL}, NULL}}
#define GetWaterTankVolume_init_zero             {{{NULL}, NULL}}
#define GetWaterTankPressure_init_zero           {{{NULL}, NULL}}
#define GetWaterSourceState_init_zero            {{{NULL}, NULL}}
#define RemoveWaterSource_init_zero              {{{NULL}, NULL}}
#define RemoveWaterTank_init_zero                {{{NULL}, NULL}}
#define Reset_init_zero                          {0}
#define GetError_init_zero                       {{{NULL}, NULL}}

/* Field tags (for use in manual encoding/decoding) */
#define GetError_error_tag                       1
#define GetWaterSourceList_waterSourceName_tag   1
#define GetWaterSourceState_waterSourceName_tag  1
#define GetWaterTankList_waterTankName_tag       1
#define GetWaterTankPressure_waterTankName_tag   1
#define GetWaterTankVolume_waterTankName_tag     1
#define RemoveWaterSource_waterSourceName_tag    1
#define RemoveWaterTank_waterTankName_tag        1
#define CreateWaterSource_name_tag               1
#define CreateWaterSource_pin_tag                2
#define CreateWaterSource_waterTankName_tag      3
#define CreateWaterTank_name_tag                 1
#define CreateWaterTank_volumeReaderPin_tag      2
#define CreateWaterTank_volumeFactor_tag         3
#define CreateWaterTank_pressureFactor_tag       4
#define CreateWaterTank_waterSourceName_tag      5
#define SetMode_mode_tag                         1
#define SetWaterSourceState_waterSourceName_tag  1
#define SetWaterSourceState_state_tag            2
#define SetWaterTankMaxVolume_waterTankName_tag  1
#define SetWaterTankMaxVolume_value_tag          2
#define SetWaterTankMinimumVolume_waterTankName_tag 1
#define SetWaterTankMinimumVolume_value_tag      2
#define SetWaterTankZeroVolume_waterTankName_tag 1
#define SetWaterTankZeroVolume_value_tag         2
#define Value_boolValue_tag                      2
#define Value_intValue_tag                       3
#define Value_doubleValue_tag                    4
#define Value_stringVlaue_tag                    5
#define Request_id_tag                           1
#define Request_createWaterSource_tag            2
#define Request_createWaterTank_tag              3
#define Request_setWaterTankMinimumVolume_tag    4
#define Request_setWaterTankMaxVolume_tag        5
#define Request_setWaterTankZeroVolume_tag       6
#define Request_setMode_tag                      7
#define Request_setWaterSourceState_tag          8
#define Request_getWaterSourceList_tag           9
#define Request_getWaterTankList_tag             10
#define Request_getWaterTankVolume_tag           11
#define Request_getWaterTankPressure_tag         12
#define Request_getWaterSourceState_tag          13
#define Request_GetError_tag                     14
#define Request_removeWaterSource_tag            15
#define Request_removeWaterTank_tag              16
#define Request_reset_tag                        17
#define Response_id_tag                          1
#define Response_message_tag                     2
#define Response_error_tag                       3

/* Struct field encoding specification for nanopb */
#define Request_FIELDLIST(X, a) \
X(a, STATIC,   SINGULAR, UINT64,   id,                1) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,createWaterSource,message.createWaterSource),   2) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,createWaterTank,message.createWaterTank),   3) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,setWaterTankMinimumVolume,message.setWaterTankMinimumVolume),   4) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,setWaterTankMaxVolume,message.setWaterTankMaxVolume),   5) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,setWaterTankZeroVolume,message.setWaterTankZeroVolume),   6) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,setMode,message.setMode),   7) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,setWaterSourceState,message.setWaterSourceState),   8) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,getWaterSourceList,message.getWaterSourceList),   9) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,getWaterTankList,message.getWaterTankList),  10) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,getWaterTankVolume,message.getWaterTankVolume),  11) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,getWaterTankPressure,message.getWaterTankPressure),  12) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,getWaterSourceState,message.getWaterSourceState),  13) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,GetError,message.GetError),  14) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,removeWaterSource,message.removeWaterSource),  15) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,removeWaterTank,message.removeWaterTank),  16) \
X(a, STATIC,   ONEOF,    MESSAGE,  (message,reset,message.reset),  17)
#define Request_CALLBACK NULL
#define Request_DEFAULT NULL
#define Request_message_createWaterSource_MSGTYPE CreateWaterSource
#define Request_message_createWaterTank_MSGTYPE CreateWaterTank
#define Request_message_setWaterTankMinimumVolume_MSGTYPE SetWaterTankMinimumVolume
#define Request_message_setWaterTankMaxVolume_MSGTYPE SetWaterTankMaxVolume
#define Request_message_setWaterTankZeroVolume_MSGTYPE SetWaterTankZeroVolume
#define Request_message_setMode_MSGTYPE SetMode
#define Request_message_setWaterSourceState_MSGTYPE SetWaterSourceState
#define Request_message_getWaterSourceList_MSGTYPE GetWaterSourceList
#define Request_message_getWaterTankList_MSGTYPE GetWaterTankList
#define Request_message_getWaterTankVolume_MSGTYPE GetWaterTankVolume
#define Request_message_getWaterTankPressure_MSGTYPE GetWaterTankPressure
#define Request_message_getWaterSourceState_MSGTYPE GetWaterSourceState
#define Request_message_GetError_MSGTYPE GetError
#define Request_message_removeWaterSource_MSGTYPE RemoveWaterSource
#define Request_message_removeWaterTank_MSGTYPE RemoveWaterTank
#define Request_message_reset_MSGTYPE Reset

#define Value_FIELDLIST(X, a) \
X(a, STATIC,   ONEOF,    BOOL,     (value,boolValue,value.boolValue),   2) \
X(a, STATIC,   ONEOF,    INT32,    (value,intValue,value.intValue),   3) \
X(a, STATIC,   ONEOF,    DOUBLE,   (value,doubleValue,value.doubleValue),   4) \
X(a, CALLBACK, ONEOF,    STRING,   (value,stringVlaue,value.stringVlaue),   5)
#define Value_CALLBACK pb_default_field_callback
#define Value_DEFAULT NULL

#define Response_FIELDLIST(X, a) \
X(a, STATIC,   SINGULAR, UINT64,   id,                1) \
X(a, STATIC,   OPTIONAL, MESSAGE,  message,           2) \
X(a, STATIC,   SINGULAR, BOOL,     error,             3)
#define Response_CALLBACK NULL
#define Response_DEFAULT NULL
#define Response_message_MSGTYPE Value

#define CreateWaterSource_FIELDLIST(X, a) \
X(a, CALLBACK, SINGULAR, STRING,   name,              1) \
X(a, STATIC,   SINGULAR, UINT32,   pin,               2) \
X(a, CALLBACK, OPTIONAL, STRING,   waterTankName,     3)
#define CreateWaterSource_CALLBACK pb_default_field_callback
#define CreateWaterSource_DEFAULT NULL

#define CreateWaterTank_FIELDLIST(X, a) \
X(a, CALLBACK, SINGULAR, STRING,   name,              1) \
X(a, STATIC,   SINGULAR, UINT32,   volumeReaderPin,   2) \
X(a, STATIC,   SINGULAR, DOUBLE,   volumeFactor,      3) \
X(a, STATIC,   SINGULAR, DOUBLE,   pressureFactor,    4) \
X(a, CALLBACK, OPTIONAL, STRING,   waterSourceName,   5)
#define CreateWaterTank_CALLBACK pb_default_field_callback
#define CreateWaterTank_DEFAULT NULL

#define SetWaterTankMinimumVolume_FIELDLIST(X, a) \
X(a, CALLBACK, SINGULAR, STRING,   waterTankName,     1) \
X(a, STATIC,   SINGULAR, DOUBLE,   value,             2)
#define SetWaterTankMinimumVolume_CALLBACK pb_default_field_callback
#define SetWaterTankMinimumVolume_DEFAULT NULL

#define SetWaterTankMaxVolume_FIELDLIST(X, a) \
X(a, CALLBACK, SINGULAR, STRING,   waterTankName,     1) \
X(a, STATIC,   SINGULAR, DOUBLE,   value,             2)
#define SetWaterTankMaxVolume_CALLBACK pb_default_field_callback
#define SetWaterTankMaxVolume_DEFAULT NULL

#define SetWaterTankZeroVolume_FIELDLIST(X, a) \
X(a, CALLBACK, SINGULAR, STRING,   waterTankName,     1) \
X(a, STATIC,   SINGULAR, DOUBLE,   value,             2)
#define SetWaterTankZeroVolume_CALLBACK pb_default_field_callback
#define SetWaterTankZeroVolume_DEFAULT NULL

#define SetMode_FIELDLIST(X, a) \
X(a, STATIC,   SINGULAR, UENUM,    mode,              1)
#define SetMode_CALLBACK NULL
#define SetMode_DEFAULT NULL

#define SetWaterSourceState_FIELDLIST(X, a) \
X(a, CALLBACK, SINGULAR, STRING,   waterSourceName,   1) \
X(a, STATIC,   SINGULAR, BOOL,     state,             2)
#define SetWaterSourceState_CALLBACK pb_default_field_callback
#define SetWaterSourceState_DEFAULT NULL

#define GetWaterTankList_FIELDLIST(X, a) \
X(a, CALLBACK, REPEATED, STRING,   waterTankName,     1)
#define GetWaterTankList_CALLBACK pb_default_field_callback
#define GetWaterTankList_DEFAULT NULL

#define GetWaterSourceList_FIELDLIST(X, a) \
X(a, CALLBACK, REPEATED, STRING,   waterSourceName,   1)
#define GetWaterSourceList_CALLBACK pb_default_field_callback
#define GetWaterSourceList_DEFAULT NULL

#define GetWaterTankVolume_FIELDLIST(X, a) \
X(a, CALLBACK, SINGULAR, STRING,   waterTankName,     1)
#define GetWaterTankVolume_CALLBACK pb_default_field_callback
#define GetWaterTankVolume_DEFAULT NULL

#define GetWaterTankPressure_FIELDLIST(X, a) \
X(a, CALLBACK, SINGULAR, STRING,   waterTankName,     1)
#define GetWaterTankPressure_CALLBACK pb_default_field_callback
#define GetWaterTankPressure_DEFAULT NULL

#define GetWaterSourceState_FIELDLIST(X, a) \
X(a, CALLBACK, SINGULAR, STRING,   waterSourceName,   1)
#define GetWaterSourceState_CALLBACK pb_default_field_callback
#define GetWaterSourceState_DEFAULT NULL

#define RemoveWaterSource_FIELDLIST(X, a) \
X(a, CALLBACK, SINGULAR, STRING,   waterSourceName,   1)
#define RemoveWaterSource_CALLBACK pb_default_field_callback
#define RemoveWaterSource_DEFAULT NULL

#define RemoveWaterTank_FIELDLIST(X, a) \
X(a, CALLBACK, SINGULAR, STRING,   waterTankName,     1)
#define RemoveWaterTank_CALLBACK pb_default_field_callback
#define RemoveWaterTank_DEFAULT NULL

#define Reset_FIELDLIST(X, a) \

#define Reset_CALLBACK NULL
#define Reset_DEFAULT NULL

#define GetError_FIELDLIST(X, a) \
X(a, CALLBACK, REPEATED, STRING,   error,             1)
#define GetError_CALLBACK pb_default_field_callback
#define GetError_DEFAULT NULL

extern const pb_msgdesc_t Request_msg;
extern const pb_msgdesc_t Value_msg;
extern const pb_msgdesc_t Response_msg;
extern const pb_msgdesc_t CreateWaterSource_msg;
extern const pb_msgdesc_t CreateWaterTank_msg;
extern const pb_msgdesc_t SetWaterTankMinimumVolume_msg;
extern const pb_msgdesc_t SetWaterTankMaxVolume_msg;
extern const pb_msgdesc_t SetWaterTankZeroVolume_msg;
extern const pb_msgdesc_t SetMode_msg;
extern const pb_msgdesc_t SetWaterSourceState_msg;
extern const pb_msgdesc_t GetWaterTankList_msg;
extern const pb_msgdesc_t GetWaterSourceList_msg;
extern const pb_msgdesc_t GetWaterTankVolume_msg;
extern const pb_msgdesc_t GetWaterTankPressure_msg;
extern const pb_msgdesc_t GetWaterSourceState_msg;
extern const pb_msgdesc_t RemoveWaterSource_msg;
extern const pb_msgdesc_t RemoveWaterTank_msg;
extern const pb_msgdesc_t Reset_msg;
extern const pb_msgdesc_t GetError_msg;

/* Defines for backwards compatibility with code written before nanopb-0.4.0 */
#define Request_fields &Request_msg
#define Value_fields &Value_msg
#define Response_fields &Response_msg
#define CreateWaterSource_fields &CreateWaterSource_msg
#define CreateWaterTank_fields &CreateWaterTank_msg
#define SetWaterTankMinimumVolume_fields &SetWaterTankMinimumVolume_msg
#define SetWaterTankMaxVolume_fields &SetWaterTankMaxVolume_msg
#define SetWaterTankZeroVolume_fields &SetWaterTankZeroVolume_msg
#define SetMode_fields &SetMode_msg
#define SetWaterSourceState_fields &SetWaterSourceState_msg
#define GetWaterTankList_fields &GetWaterTankList_msg
#define GetWaterSourceList_fields &GetWaterSourceList_msg
#define GetWaterTankVolume_fields &GetWaterTankVolume_msg
#define GetWaterTankPressure_fields &GetWaterTankPressure_msg
#define GetWaterSourceState_fields &GetWaterSourceState_msg
#define RemoveWaterSource_fields &RemoveWaterSource_msg
#define RemoveWaterTank_fields &RemoveWaterTank_msg
#define Reset_fields &Reset_msg
#define GetError_fields &GetError_msg

/* Maximum encoded size of messages (where known) */
/* Request_size depends on runtime parameters */
/* Value_size depends on runtime parameters */
/* Response_size depends on runtime parameters */
/* CreateWaterSource_size depends on runtime parameters */
/* CreateWaterTank_size depends on runtime parameters */
/* SetWaterTankMinimumVolume_size depends on runtime parameters */
/* SetWaterTankMaxVolume_size depends on runtime parameters */
/* SetWaterTankZeroVolume_size depends on runtime parameters */
/* SetWaterSourceState_size depends on runtime parameters */
/* GetWaterTankList_size depends on runtime parameters */
/* GetWaterSourceList_size depends on runtime parameters */
/* GetWaterTankVolume_size depends on runtime parameters */
/* GetWaterTankPressure_size depends on runtime parameters */
/* GetWaterSourceState_size depends on runtime parameters */
/* RemoveWaterSource_size depends on runtime parameters */
/* RemoveWaterTank_size depends on runtime parameters */
/* GetError_size depends on runtime parameters */
#define Reset_size                               0
#define SetMode_size                             2

#ifdef __cplusplus
} /* extern "C" */
#endif

#endif
