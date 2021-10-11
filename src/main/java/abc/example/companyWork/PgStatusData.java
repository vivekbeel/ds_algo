package abc.example.companyWork;

public class PgStatusData {
	private String orderNo;
	private long itemId;
	private String proposalNo;
	private long leadId;
	private long productId;
	private long insurerId;
	private String uniqueId;
	private long planId;
	private double refundAmount;
	private String refundStatus;
	private String refundRequestedDate;
	private String refundLastDate;
	private String reason;
	private long refundRefNo;
	private double txAmount;
	private String txDate;
	private int txStatus;
	private String paymentMode;
	private double totalRefundedAmount;
	private double netAmount;
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public String getProposalNo() {
		return proposalNo;
	}
	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
	}
	public long getLeadId() {
		return leadId;
	}
	public void setLeadId(long leadId) {
		this.leadId = leadId;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public long getInsurerId() {
		return insurerId;
	}
	public void setInsurerId(long insurerId) {
		this.insurerId = insurerId;
	}
	public long getPlanId() {
		return planId;
	}
	public void setPlanId(long planId) {
		this.planId = planId;
	}
	public double getTxAmount() {
		return txAmount;
	}
	public void setTxAmount(double txAmount) {
		this.txAmount = txAmount;
	}
	public String getTxDate() {
		return txDate;
	}
	public void setTxDate(String txDate) {
		this.txDate = txDate;
	}
	public int getTxStatus() {
		return txStatus;
	}
	public void setTxnStatus(int txStatus) {
		this.txStatus = txStatus;
	}
	public String getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public double getTotalRefundedAmount() {
		return totalRefundedAmount;
	}
	public void setTotalRefundedAmount(double totalRefundedAmount) {
		this.totalRefundedAmount = totalRefundedAmount;
	}
	public double getNetAmount() {
		return netAmount;
	}
	public void setNetAmount(double netAmount) {
		this.netAmount = netAmount;
	}
	public double getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(double refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundStatus() {
		return refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRefundRequestedDate() {
		return refundRequestedDate;
	}
	public void setRefundRequestedDate(String refundRequestedDate) {
		this.refundRequestedDate = refundRequestedDate;
	}
	public String getRefundLastDate() {
		return refundLastDate;
	}
	public void setRefundLastDate(String refundLastDate) {
		this.refundLastDate = refundLastDate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public long getRefundRefNo() {
		return refundRefNo;
	}
	public void setRefundRefNo(long refundRefNo) {
		this.refundRefNo = refundRefNo;
	}
}
