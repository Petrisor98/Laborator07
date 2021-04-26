package ro.pub.cs.systems.eim.lab07.calculatorwebservice.general;

public interface Constants {

    boolean DEBUG = true;

    String TAG = "[CalculatorWebService]";

    String GET_WEB_SERVICE_ADDRESS = "https://wi-fi.cs.pub.ro/~dniculescu/didactic/eim/expr/expr_get.php";
    String POST_WEB_SERVICE_ADDRESS = "https://wi-fi.cs.pub.ro/~dniculescu/didactic/eim/expr/expr_post.php";


    String ERROR_MESSAGE_EMPTY = "Operator fields cannot be empty!";

    int GET_OPERATION = 0;
    int POST_OPERATION = 1;

    String OPERATION_ATTRIBUTE = "operation";
    String OPERATOR1_ATTRIBUTE = "t1";
    String OPERATOR2_ATTRIBUTE = "t2";

}
