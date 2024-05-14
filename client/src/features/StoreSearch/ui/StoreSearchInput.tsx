import { IStoreSearchInputProps } from '../model/interfaces';
import './styles.scss';
export const StoreSearchInput: React.FC<
	IStoreSearchInputProps
> = StoreSearchInputProps => {
	return (
		<input
			className='primary-input search-input'
			placeholder='Поиск'
			{...StoreSearchInputProps}
		/>
	);
};
