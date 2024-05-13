import { useStoreSearchStore } from '@/shared/stores/StoreSearch.store';
import React from 'react';
import { StoreSearchInput } from './StoreSearchInput';

export const StoreSearch: React.FC = () => {
	const { search, setSearch } = useStoreSearchStore();
	const onChangeHandler = (e: React.ChangeEvent<HTMLInputElement>) => {
		setSearch(e.target.value);
	};
	return <StoreSearchInput onChange={onChangeHandler} value={search} />;
};
