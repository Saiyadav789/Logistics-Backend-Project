package com.alpha.logistics.Dto;

public class OrderDto {
		private int id;
		private String Orderdate;
		private int cargoId;
		private String cargoName;
		private String cargoDescription;
		private double cargoWeight;
		private int cargoCount;
		private int loadingAddressId;
		private int unloadingAddressId;
		private String email;
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getOrderdate() {
			return Orderdate;
		}
		public void setOrderdate(String orderdate) {
			this.Orderdate = orderdate;
		}
		public int getCargoId() {
			return cargoId;
		}
		public void setCargoId(int cargoId) {
			this.cargoId = cargoId;
		}
		public String getCargoName() {
			return cargoName;
		}
		public void setCargoName(String cargoName) {
			this.cargoName = cargoName;
		}
		public String getCargoDescription() {
			return cargoDescription;
		}
		public void setCargoDescription(String cargoDescription) {
			this.cargoDescription = cargoDescription;
		}
		public double getCargoWeight() {
			return cargoWeight;
		}
		public void setCargoWeight(double cargoWeight) {
			this.cargoWeight = cargoWeight;
		}
		public int getCargoCount() {
			return cargoCount;
		}
		public void setCargoCount(int cargoCount) {
			this.cargoCount = cargoCount;
		}
		public int getLoadingAddressId() {
			return loadingAddressId;
		}
		public void setLoadingAddressId(int loadingAddressId) {
			this.loadingAddressId = loadingAddressId;
		}
		public int getUnloadingAddressId() {
			return unloadingAddressId;
		}
		public void setUnloadingAddressId(int unloadingAddressId) {
			this.unloadingAddressId = unloadingAddressId;
		}
		public OrderDto(int id, String orderdate, int cargoId, String cargoName, String cargoDescription,
				double cargoWeight, int cargoCount, int loadingAddressId, int unloadingAddressId,String email) {
			super();
			this.id = id;
			this.Orderdate = orderdate;
			this.cargoId = cargoId;
			this.cargoName = cargoName;
			this.cargoDescription = cargoDescription;
			this.cargoWeight = cargoWeight;
			this.cargoCount = cargoCount;
			this.loadingAddressId = loadingAddressId;
			this.unloadingAddressId = unloadingAddressId;
			this.email=email;
		}
		@Override
		public String toString() {
			return "OrderDto [id=" + id + ", Orderdate=" + Orderdate + ", cargoId=" + cargoId + ", cargoName="
					+ cargoName + ", cargoDescription=" + cargoDescription + ", cargoWeight=" + cargoWeight
					+ ", cargoCount=" + cargoCount + ", loadingAddressId=" + loadingAddressId + ", unloadingAddressId="
					+ unloadingAddressId +",Email="+email+ "]";
		}
		public OrderDto() {
			super();
		}
		
}
