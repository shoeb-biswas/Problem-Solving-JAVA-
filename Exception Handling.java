try{
  processpayment(amount);
  updateuserstatus();
  sendconfirmationemail();
}catch (paymentgetwayexception e){
  showmessage("payment failed, please try again");
    logError(e);
}
