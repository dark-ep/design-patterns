package cn.ep.dp.builder.complex.model;

/**
 * 保险合同对象
 *
 * @author lhl
 */
public class InsuranceContract {

    private String contractId;
    private String personName;
    private String companyName;
    private long beginDate;
    private long endDate;
    private String otherDate;

    private InsuranceContract(ConcreteBuilder builder) {
        this.contractId = builder.contractId;
        this.personName = builder.personName;
        this.companyName = builder.companyName;
        this.beginDate = builder.beginDate;
        this.endDate = builder.endDate;
        this.otherDate = builder.otherDate;
    }

    /**
     * 保险合同操作
     */
    public void someOperation() {
        System.out.println("Now in Insurance Contract someOperation==" + this);
    }

    @Override
    public String toString() {
        return "InsuranceContract [contractId=" + contractId + ", personName=" + personName + ", companyName="
                + companyName + ", beginDate=" + beginDate + ", endDate=" + endDate + ", otherDate=" + otherDate + "]";
    }

    public static class ConcreteBuilder {
        private String contractId;
        private String personName;
        private String companyName;
        private long beginDate;
        private long endDate;
        private String otherDate;

        public ConcreteBuilder(String contractId, long beginDate, long endDate) {
            this.contractId = contractId;
            this.beginDate = beginDate;
            this.endDate = endDate;
        }

        public ConcreteBuilder setContractId(String contractId) {
            this.contractId = contractId;
            return this;
        }

        public ConcreteBuilder setPersonName(String personName) {
            this.personName = personName;
            return this;
        }

        public ConcreteBuilder setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public ConcreteBuilder setBeginDate(long beginDate) {
            this.beginDate = beginDate;
            return this;
        }

        public ConcreteBuilder setEndDate(long endDate) {
            this.endDate = endDate;
            return this;
        }

        public ConcreteBuilder setOtherDate(String otherDate) {
            this.otherDate = otherDate;
            return this;
        }

        /**
         * 构建合同对象
         *
         * @return 合同对象
         */
        public InsuranceContract build() {
            return new InsuranceContract(this);
        }

    }

}
