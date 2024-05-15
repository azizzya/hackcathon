import './styles.scss';
import {StoreBalanceProps} from '../model/interfaces'
export const StoreBalance: React.FC<StoreBalanceProps> = ({balance}) => {
	return <div className='storeBalance-wrapper'>{`${balance}¢`}</div>; //заготовка
};
