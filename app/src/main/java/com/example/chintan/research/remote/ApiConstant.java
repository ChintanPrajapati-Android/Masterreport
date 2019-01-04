package com.example.chintan.research.remote;

public class ApiConstant {

    public static final String SUCCESS = "SUCCESS";
    public static final String YES = "YES";
    //all method name
    public static final String MTHD_DOLOGOUT = "doLogout";
    public static final String MTHD_DOLOGIN = "doLogin";
    public static final String MTHD_GETACTIVATIONSTATUS = "getToConnectStatus";
    public static final String MTHD_GETDASHBOARDDATA = "getDashboardData";//use in vehicle status
    public static final String MTH_GETTRAKZEEDASHBOARDDATA = "getTrakzeeDashboard";
    public static final String MTHD_GETDAILYTRAVELDETAIL = "getDailyTravelDetail";
    public static final String MTHD_GETSTOPPAGESUMMARY = "getStopPageSummary";
    public static final String MTHD_GETTRAVELSUMMARY = "getTravelSummary";
    public static final String MTHD_ADDPORTLIST = "setMobilesetting";
    public static final String MTHD_CHANGEPASSWORD = "changePassword";
    public static final String MTHD_GETLIVETRACKINGDATA = "getLiveTrackingData";
    public static final String MTHD_GETTOOLTIPDATA = "getToolTipData";
    public static final String MTHD_GETTRAVELDETAILSUMMARY = "getTravelDetailSummary";
    public static final String MTHD_GETSTOPPAGEDETAILSUMMARY = "getStopPageDetailSummary";
    //public static final String MTHD_GETPLAYBACKDATA = "getPlayBackData";
    public static final String MTHD_GETPLAYBACKDATA = "getPlayBackDataFlion";
    public static final String MTHD_GETGEOFENCEDATA = "getGeofenceData";
    public static final String MTHD_GETGEOFENCESUMMARYDATA = "getGeofenceSummaryData";
    public static final String MTHD_GETFILTERDATA = "getTrakZeeFilterData";
    public static final String MTHD_GETTRIPSUMMARY = "getTripSummary";
    public static final String MTHD_GETTRIPDETAIL = "getTripDetail";
    public static final String MTHD_GETSHARELOCATION = "getShareLocation";
    public static final String MTHD_GETALERTDATA = "getTrakzeeAlertData";
    public static final String MTHD_GETSECONDLEVELALERTDATA = "getTrakzeeAlertDataSecondLevel";
    public static final String MTHD_GETIDLEDETAILSUMMARY = "getIdleDetailSummary";
    public static final String MTHD_GETDIGITALPORTSUMMARY = "getDigitalPortSummary";
    public static final String MTHD_GETOVERSPEEDVIOLATIONREPORT = "getOverSpeedViolationReport";
    public static final String MTHD_GETINACTIVEDETAILDATA = "getInactiveDetailData";
    public static final String MTHD_GETSYSTEMLOGSUMMARYDATA = "getSystemLogSummaryData";
    public static final String MTHD_GETIDLESUMMARY = "getIdleSummary";
    //overSpeedViolationsDetail
    public static final String MTHD_OVERSPEEDVIOLATIONSDETAIL = "getOverSpeedViolationDetailReport";
    public static final String MTHD_GETINACTIVESUMMARY = "getInactiveSummary";
    public static final String MTHD_GETCOMPANYRIGHTS = "getCompanyRights";
    public static final String MTHD_GETVEHICLETYPELIST = "getVehicleTypeList";
    public static final String MTHD_GETDEVICEMODELRIGHTS = "getDeviceModelRights";
    public static final String MTHD_GETBRANCH = "getBranch";
    public static final String MTHD_GETDEVICEATTACHEDPORTS = "getDeviceAttachedPorts";
    public static final String MTHD_ADDOBJECT = "addObject";
    public static final String MTHD_getAlertFilterData = "getAlertFilterData";
    public static final String MTHD_getDigitalPortDetail = "getDigitalPortDetail";
    public static final String MTHD_GETCOMMANDSTATUS = "getCommandStatus";
    public static final String MTHD_GETHISTORY = "getImmobilizeAndSecurityHistory";
    public static final String MTHD_GETPOISUMMARY = "getPOISummary";
    public static final String MTHD_GETPOISUMMARYFILTER = "getPOISummaryFilterData";
    ;
    public static final String MTHD_ADDPOIDATA = "addPOIData";
    public static final String MTHD_GETPOIDATA = "getPOIData";
    public static final String MTHD_GETGEOFENCERECORD = "getGeofenceRecord";
    public static final String MTHD_ADDGEOFENCEDATA = "addNewGeofenceData";
    public static final String MTHD_ADDEXPENSEDETAIL = "addVehicleExpense12";
    public static final String MTHD_GETMAINTANANCETYPE = "getMaintenanceType";
    public static final String MTHD_GETFUELSTATION = "getFuelStation";
    public static final String MTHD_GETEXPENSEDETAIL = "getVehicleExpense";
    public static final String MTHD_GETADDALERTOVERVIEWLIST = "getAddAlertDataOverview";
    public static final String MTHD_GETADDALERTTYPEDATA = "getAlertTypeData";
    public static final String MTHD_GETVEHICLEDATA = "getVehicleData";
    public static final String MTHD_GETALERTGEOFENCEDATA = "getAlertGeofenceData";
    public static final String MTHD_GETALERTPOIDATA = "getAlertPOIData";
    public static final String MTHD_GETDUPLICATEVEHICLEALERTTYPE = "getDuplicateVehicleAlertType";
    public static final String MTHD_GETUSERDATA = "getUserData";
    public static final String MTHD_ADDALERTDATA = "getAddAlertData";
    public static final String MTHD_GETEDITALERTDATA = "getEditAlertData";
    public static final String MTHD_GETBRANCHDATA = "getBranchData";
    // New reports added in Trakzee (Temperature , POI, Geofence  summary and detail)
    public static final String MTHD_GETTEMPERATURESUMMARY = "getTemperatureSummary";
    public static final String MTHD_GETTEMPERATUREDETAILSUMMARY = "getTemperatureDetail";
    public static final String MTHD_GETGEOFENCESUMMARYREPORTDATA = "getTrakzeeGeofenceSummaryData";
    public static final String MTHD_GETGEOFENCEDETAILREPORTDATA = "getTrakzeeGeofenceDetailSummaryData";
    public static final String MTHD_GETPOISUMMARYDATA = "getTrakzeePOISummaryData";
    public static final String MTHD_GETPOISUMMARYDETAILDATA = "getTrakzeePOIDetailSummaryData";
    //Unused Web service(Trakzee and VTS)
    public static final String MTHD_GETGPSDEVICEDATA = "getGpsDeviceData";
    public static final String MTHD_GETPORTSPECIFICATION = "getPortSpecification";
    public static final String MTHD_GETVEHICLELIST = "getVehicleList";
    public static final String MTHD_GETCOMPANY = "getCompany";
    public static final String MTHD_GETRESELLERS = "getResellers";
    public static final String MTHD_GETGROUP = "getGroup";
    public static final String MTHD_GETPORTLIST = "getPortList";
    public static final String MTHD_EDITGPSDEVICE = "editGPSDevice";
    public static final String MTHD_SETADDDEVICEDATA = "setAddDeviceData";
    public static final String MTHD_GETGPSDEVICERESELLERDEVICEMODELVEHICLEMODEL = "getGpsDeviceResellerDeviceModelVehicleModel";
    public static final String MTHD_GETVTSTHEME = "getVTSTheme";
    public static final String MTHD_GETGPSDEVICEMODEL = "getGPSDeviceModel";
    public static final String MTHD_GETLOCATION = "getLocation";   //means branch
    public static final String MTHD_GETUSERS = "getUsers";
    public static final String MTHD_GETUSERGROUPS = "getUserGroups";
    public static final String MTHD_GETRFIDDATA = "getRFIDData";
    public static final String MTHD_GETCOMMAND = "getCommand";
    public static final String MTHD_ADDTRIP = "addTrip";
    public static final String MTHD_GETADDTRIPDATA = "getTracknovateTrip";
    public static final String MTHD_SETUSERLANGUAGE = "setUserLanguage";
    public static final String MTHD_GETDRIVERINFOFLEETGUARD = "getDriverInfoFleetGraud";
    public static final String MTHD_GETVEHICLESERVICE = "getVehicleService";
    public static final String MTHD_GETFINDNEARBYDATA = "getFindNearByData";
    public static final String MTHD_GETPOIINRANGE = "getPOIInRange";
    public static final String MTHD_GETPOIDETAILFILTER = "getPOIDetailFilterData";
    public static final String MTHD_GETCOUNTRYDATA = "getCountryData";
    public static final String MTHD_GETALLVEHICLE = "getAllVehicle";
    static final String MOBILE_SERVICES = "mobileservice";
    static final String METHOD = "method";
    static final String FAIL = "FAIL";
    public static boolean FROM_ADDOBJECT = false;


}