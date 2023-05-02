import { ContactInformation } from '../../components/forms/ContactInformation';
import { ShippingAddress } from './ShippingAddress';
import './Cart.css';

export function Cart() {
    return (
        <>
            <ContactInformation></ContactInformation>
            <ShippingAddress></ShippingAddress>
        </>
    );
}