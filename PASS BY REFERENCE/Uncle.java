class Aunty {
    private String jobTitle;

    public Aunty(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}

class Dinga {
    static void needjob(Aunty a) {
        a.setJobTitle("Manager");
    }
}

class Uncle {
    public static void main(String[] args) {
        Aunty a = new Aunty("Software Engineer");
        System.out.println("Before calling needjob method: " + a.getJobTitle());
        Dinga.needjob(a);
        System.out.println("After calling needjob method: " + a.getJobTitle());
    }
}
