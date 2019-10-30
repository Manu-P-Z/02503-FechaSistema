/* 
 * Copyright 2019 Manu Portolés Zagalá.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Manu Portolés Zagalá
 */
public class Main {

    public static final SimpleDateFormat SDF = new SimpleDateFormat();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        int d;
        int m;
        int a;
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH) + 1;
        a = cal.get(Calendar.YEAR);
        System.out.printf("%s %2d/%2d/%2d", "Fecha del sistema", d, m, a);
        // SDF.applyPattern(PATRON_FECHA_CORTA);
        //  Date d = new Date();
        //  System.out.println(SDF.format(d.getTime()));
    }

}
