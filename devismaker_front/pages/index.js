import until from '../utils/until'
import * as React from "react";
import Link from "next/link";
import Layout from "../components/Layout";
import {useEffect, useState} from "react/cjs/react.production.min";
import axios from "axios";

const Index = ({devis}) => {
    const devisList = devis.map(devi => {
        console.log(devi)
        return <p>{devi.client}</p>
    });


    return (
        <Layout>
            {devisList}
            <form>
                <input
                    value={state}
                    type="text"
                    onChange={e => setState(e.target.value)}
                    id='id'/>
                <button
                    type='submit'
                    onClick={fetchData0}
                >
                    Rechercher
                </button>
            </form>
        </Layout>
    )
}

Index.getInitialProps = async () => {
    const res = await fetch('http://localhost:9090/devis/get');
    const json = await res.json();
    return {
        devis: json
    }
};


export default Index

/*
export async function getServerSideProps(context) {
    const [response, err] = await until(axios.get('http://localhost:9090/products/'))

    if (err !== null) {
        console.log('An error occurred')
        return {
            props: {
                isSuccess: false,
                response: null
            }
        }
    }

    return {
        props: {
            isSuccess: true,
            response: response
        }
    }
}*/
