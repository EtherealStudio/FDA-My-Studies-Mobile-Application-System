/*
 * Copyright © 2017-2019 Harvard Pilgrim Health Care Institute (HPHCI) and its Contributors.
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * Funding Source: Food and Drug Administration (“Funding Agency”) effective 18 September 2014 as Contract no. HHSF22320140030I/HHSF22301006T (the “Prime Contract”).
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.harvard.fda.userModule.webserviceModel;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Rohit on 5/4/2017.
 */

public class ActivityData extends RealmObject {

    @PrimaryKey
    private String studyId;
    private String message;
    private RealmList<Activities> activities;

    public String getStudyId() {
        return studyId;
    }

    public void setStudyId(String studyId) {
        this.studyId = studyId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RealmList<Activities> getActivities() {
        return activities;
    }

    public void setActivities(RealmList<Activities> activities) {
        this.activities = activities;
    }
}
