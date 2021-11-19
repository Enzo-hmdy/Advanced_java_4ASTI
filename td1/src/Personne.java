public class Personne {
    String name;
    Date date;
    String country;
    int[] social_nbr = new int[13];
    String work;

    public Personne() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int[] getSocial_nbr() {
        return this.social_nbr;
    }

    public void setSocial_nbr(int[] social_nbr) {
        this.social_nbr = social_nbr;
    }

    public String getWork() {
        return this.work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Personne name(String name) {
        setName(name);
        return this;
    }

    public Personne date(Date date) {
        setDate(date);
        return this;
    }

    public Personne country(String country) {
        setCountry(country);
        return this;
    }

    public Personne social_nbr(int[] social_nbr) {
        setSocial_nbr(social_nbr);
        return this;
    }

    public Personne work(String work) {
        setWork(work);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Personne)) {
            return false;
        }
        Personne personne = (Personne) o;
        return Objects.equals(name, personne.name) && Objects.equals(date, personne.date) && Objects.equals(country, personne.country) && Objects.equals(social_nbr, personne.social_nbr) && Objects.equals(work, personne.work);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date, country, social_nbr, work);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", date='" + getDate() + "'" +
            ", country='" + getCountry() + "'" +
            ", social_nbr='" + getSocial_nbr() + "'" +
            ", work='" + getWork() + "'" +
            "}";
    }

    Personne(String name,Date date,String country,int[] social_nbr,String work)
    {
        this.name = name;
        this.date = date;
        this.country = country;
        this.social_nbr = social_nbr;
        this.work = work;
    }

}