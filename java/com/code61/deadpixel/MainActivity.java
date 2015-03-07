/*
                    DEAD PIXEL
   Copyright (C) 2015 Code61

   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */


package com.code61.deadpixel;


import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

public class MainActivity extends Activity {

   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      MainActivity.changeFragment(getFragmentManager(), new MainFragment());
   }


   public static void changeFragment (FragmentManager manager, Fragment newFragment)
   {
      FragmentManager fragmentManager = manager;
      fragmentManager.beginTransaction()
              .replace(R.id.activity_main, newFragment)
              .addToBackStack("")
              .commit();
   }

   @Override
   //Back button override
   public void onBackPressed() {
      FragmentManager fm = getFragmentManager();

      if(fm.getBackStackEntryCount()>0)
      {
         fm.popBackStackImmediate(null, fm.POP_BACK_STACK_INCLUSIVE);

         fm.beginTransaction()
                 .replace(R.id.activity_main, new MainFragment())
                 .commit();
      }
      else
      {
         super.onBackPressed();
      }
   }

}

