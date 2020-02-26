package com.backbase.billpay.fiserv.enrolment;

import com.backbase.billpay.fiserv.common.model.Header;
import com.backbase.billpay.integration.rest.spec.v2.billpay.enrolment.BillPayEnrolmentPostResponseBody;
import com.backbase.billpay.integration.rest.spec.v2.billpay.enrolment.MigrationGetResponseBody;
import com.backbase.billpay.integration.rest.spec.v2.billpay.enrolment.UserByIdGetResponseBody;

/**
 * Interface for enrolment operations.
 */
public interface EnrolmentService {

    /**
     * Find the migration ID to use for enrolment or null if the account is not enrolled.
     * @param user the user to check if migration is available.
     * @return migration id response.
     */
    MigrationGetResponseBody getMigrationId(String user);

    /**
     * Enrol the user provided into Bill Pay.
     * @param header header information on the subscriber.
     * @param user the user to enrol.
     * @return enrolment response.
     */
    BillPayEnrolmentPostResponseBody enrol(Header header, String user);
    
    /**
     * Retrieve the subscriber information held by fiserv bill pay.
     * @param header header information on the subscriber.
     * @param userId the user id to retrieve the subscriber info.
     * @return subscriber information response.
     */
    UserByIdGetResponseBody getSubscriberInfo(Header header, String userId);
}