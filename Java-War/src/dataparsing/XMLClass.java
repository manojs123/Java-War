package dataparsing;

public class XMLClass
{
	
	private String SellerName;
	private String SellerRating;
	private String PaymentTypes;
	private String ShippingInfo;
	private String CurrentBid;
	private String TimeLeft; 
	private String BidderName;
	private String BidderRating;
	private String Description;
	
	
	public XMLClass(String SellerName,String SellerRating,String PaymentTypes,String ShippingInfo,String CurrentBid,String TimeLeft,String BidderName,String BidderRating,String Description)
	{
		this.setSellerName(SellerName);
		this. SellerRating=SellerRating;
		this.PaymentTypes=PaymentTypes;
		this.ShippingInfo=ShippingInfo;
		this.CurrentBid=CurrentBid;
		this.TimeLeft=TimeLeft;
		this.BidderName=BidderName;
		this.BidderRating=BidderRating;
		this.Description=Description;
		
	
	}
	
	
	public String getSellerRating() {
		return SellerRating;
	}
	public void setSellerRating(String sellerRating) {
		SellerRating = sellerRating;
	}
	public String getPaymentTypes() {
		return PaymentTypes;
	}
	public void setPaymentTypes(String paymentTypes) {
		PaymentTypes = paymentTypes;
	}
	public String getShippingInfo() {
		return ShippingInfo;
	}
	public void setShippingInfo(String shippingInfo) {
		ShippingInfo = shippingInfo;
	}
	public String getCurrentBid() {
		return CurrentBid;
	}
	public void setCurrentBid(String currentBid) {
		CurrentBid = currentBid;
	}
	public String getTimeLeft() {
		return TimeLeft;
	}
	public void setTimeLeft(String timeLeft) {
		TimeLeft = timeLeft;
	}
	public String getBidderName() {
		return BidderName;
	}
	public void setBidderName(String bidderName) {
		BidderName = bidderName;
	}
	public String getBidderRating() {
		return BidderRating;
	}
	public void setBidderRating(String bidderRating) {
		BidderRating = bidderRating;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}


	public String getSellerName() {
		return SellerName;
	}


	public void setSellerName(String sellerName) {
		SellerName = sellerName;
	} 

}
