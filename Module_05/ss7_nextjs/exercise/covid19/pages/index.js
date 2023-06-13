import styles from "@/styles/Home.module.css";
import axios from "axios";

export default function Home({ dataCovid }) {
  return (
    <>
    <main className={styles.main}>
      <h1>Vietnam COVID-19 Information</h1>
      <table className={styles.table}>
        <thead>
          <tr className={styles.tr}>
            <th className={styles.th}>ID</th>
            <th className={styles.th}>Name</th>
            <th className={styles.th}>Death</th>
            <th className={styles.th}>Treating</th>
            <th className={styles.th}>Cases</th>
            <th className={styles.th}>Recovered</th>
            <th className={styles.th}>Case Today</th>
          </tr>
        </thead>
        <tbody>
          {dataCovid.map((values, index) => (
            <tr className={styles.tr} key={index}>
              <td className={styles.td}>{index + 1}</td>
              <td className={styles.td}>{values.name}</td>
              <td className={styles.td}>{values.death}</td>
              <td className={styles.td}>{values.treating}</td>
              <td className={styles.td}>{values.cases}</td>
              <td className={styles.td}>{values.recovered}</td>
              <td className={styles.td}>{values.casesToday}</td>
            </tr>
          ))}
        </tbody>
        </table>
      </main>
    </>
  );
}

export async function getServerSideProps() {
  const response = await axios.get("http://localhost:8080/locations");
  return {
    props: {
      dataCovid: response.data,
    },
  };
}
