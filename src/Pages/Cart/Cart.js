import { HFormWrapper } from '../../components/layout/FormInputWrapper';
import { ContactInformationForm } from '../../components/forms/ContactInformationForm';
import { ShippingAddressForm } from '../../components/forms/ShippingAddressForm';
import { FormHeader } from '../../components/text/FormHeader';
import { FormTextInput } from '../../components/input/FormTextInput';
import './Cart.css';
import { CartItemTitleAndQuantity } from '../../components/entities/CartItemTitleAndQuantity';

export function Cart() {
    return (
        <>
            <ShippingAddressForm></ShippingAddressForm>
            <CartItemTitleAndQuantity text="TestItem" value="20"></CartItemTitleAndQuantity>
        </>
    );
}