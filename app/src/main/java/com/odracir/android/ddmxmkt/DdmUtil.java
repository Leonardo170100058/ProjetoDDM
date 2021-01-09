package com.odracir.android.ddmxmkt;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*public class DdmUtil {

    Activity mActivity;

    public DdmUtil(Activity pA){
        this.mActivity = pA;
    }//DdmUtil

    public void fb(
            String pStrMsg
    ){
        Toast t = Toast.makeText(
                this.mActivity,
                pStrMsg,
                Toast.LENGTH_LONG
        );
        t.show();
    }//fb

    public void phoneTo(
            String pStrPhoneNumber
    ){
        try {
            Uri uriForPhoneNumber = Uri.parse("tel:" + pStrPhoneNumber);

            Intent intentForMakingThePhoneCall =
                    new Intent(
                            Intent.ACTION_CALL
                    );

            intentForMakingThePhoneCall.setData(
                    uriForPhoneNumber
            );

            boolean bUserAuthorizedTheAppToMakePhoneCalls =
                    ContextCompat.checkSelfPermission(
                            mActivity,
                            Manifest.permission.CALL_PHONE
                    ) == PackageManager.PERMISSION_GRANTED;

            if (bUserAuthorizedTheAppToMakePhoneCalls) {
                this.mActivity.startActivity(
                        intentForMakingThePhoneCall
                );
            }
            else{
                boolean bUserAcceptsExplanationsOnWhyThePermissionIsImportant =
                        mActivity.shouldShowRequestPermissionRationale(
                                Manifest.permission.CALL_PHONE
                        );
                if (bUserAcceptsExplanationsOnWhyThePermissionIsImportant){
                    fb("Without this permission, the app can NOT make phone calls.");
                }
            }
        }//try
        catch(Exception e){
            Log.e(
                    getClass().getName(),
                    e.toString()
            );
        }//catch
    }//phoneTo

    public Map<Integer, ArrayList<String>>
    identifyPermissionsGrantedAndDenied(
            String[] paNecessaryPermissions
    )
    {
        Map<Integer, ArrayList<String>> retMap = new HashMap<>();
        ArrayList<String> alGranted = new ArrayList<>();
        ArrayList<String> alDenied = new ArrayList<>();

        for (String permission : paNecessaryPermissions){
            boolean bGranted =
                    ContextCompat.checkSelfPermission(
                            mActivity,
                            permission
                    ) == PackageManager.PERMISSION_GRANTED;

            boolean bDenied =
                    ContextCompat.checkSelfPermission(
                            mActivity,
                            permission
                    ) == PackageManager.PERMISSION_DENIED;

            if (bGranted) alGranted.add(permission);
            if (bDenied) alDenied.add(permission);
        }//for*/

        //retMap.put(/* Integer 0 */ PackageManager.PERMISSION_GRANTED, alGranted);
        //retMap.put(/* Integer -1 */ PackageManager.PERMISSION_DENIED, alDenied);

        //return retMap;
    //}//identifyPermissionsGrantedAndDenied

    //public void requestNecessaryPermissionsNotYetGranted(
            //String[] paNecessaryPermissions,
            //int piCallBackCodeForWhenTheUserResponds
    //){
        /*
        do not request permissions already granted
         */
        /*Map<Integer, ArrayList<String>> map =
                this.identifyPermissionsGrantedAndDenied
                        (paNecessaryPermissions);

        ArrayList<String> alDenied = map.get(PackageManager.PERMISSION_DENIED);

        if(alDenied.size()>0){
            //convert from ArrayList<String> to String[]
            String[] aDenied = new String[alDenied.size()];
            alDenied.toArray(aDenied);
            this.mActivity.requestPermissions(
                    //alDenied, //invalid syntax , because String[] is expected
                    aDenied,
                    piCallBackCodeForWhenTheUserResponds
            );
        }//if

    }//requestNecessaryPermissionsNotYetGranted

    public String permissionsStatusToString(
            String[] paNecessaryPermissions
    ){
        String strRet = "";

        Map<Integer, ArrayList<String>> map =
                this.identifyPermissionsGrantedAndDenied(paNecessaryPermissions);

        ArrayList<String> alGranted =
                map.get(PackageManager.PERMISSION_GRANTED);
        ArrayList<String> alDenied =
                map.get(PackageManager.PERMISSION_DENIED);

        strRet+="GRANTED:\n";
        for(String spg : alGranted) strRet+=spg+"\n";

        strRet+="\n";
        strRet+="DENIED:\n";
        for(String spd : alDenied) strRet+=spd+"\n";

        return strRet;
    }//permissionsStatusToString
}*/
