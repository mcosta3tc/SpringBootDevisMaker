import until from '../utils/until'
import * as React from "react";
import Link from "next/link";
import Layout from "../components/Layout";
import {useEffect, useState} from "react/cjs/react.production.min";
import fetch from 'isomorphic-unfetch'
import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableContainer from '@material-ui/core/TableContainer';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import Paper from '@material-ui/core/Paper';

const Index = ({list}) => {

    return (
        <Layout>
            <TableContainer component={Paper}>
                <Table aria-label="simple table">
                    <TableHead>
                        <TableRow>
                            <TableCell>Client</TableCell>
                            <TableCell>Département</TableCell>
                            <TableCell>Produit</TableCell>
                            <TableCell>Prix</TableCell>
                        </TableRow>
                    </TableHead>
                    <TableBody>
                        {list.map((row) => (
                            <TableRow>
                                <TableCell>{row.name}</TableCell>
                                <TableCell>{row.county}</TableCell>
                                <TableCell>{row.devis.product.name}</TableCell>
                                <TableCell>{row.devis.product.price}</TableCell>
                            </TableRow>
                        ))}
                    </TableBody>
                </Table>
            </TableContainer>
        </Layout>
    )
}


Index.getInitialProps = async () => {
    const resp = await fetch('http://localhost:8080/api/clients')
    const json = await resp.json();
    return {list: json}
}

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
